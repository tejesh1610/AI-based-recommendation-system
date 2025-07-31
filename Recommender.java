import org.apache.mahout.cf.taste.eval.*;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.*;
import org.apache.mahout.cf.taste.impl.neighborhood.*;
import org.apache.mahout.cf.taste.impl.recommender.*;
import org.apache.mahout.cf.taste.impl.similarity.*;
import org.apache.mahout.cf.taste.model.*;
import org.apache.mahout.cf.taste.neighborhood.*;
import org.apache.mahout.cf.taste.recommender.*;
import org.apache.mahout.cf.taste.similarity.*;

import java.io.File;
import java.util.List;

public class RecommenderExample {
    public static void main(String[] args) throws Exception {
        DataModel model = new FileDataModel(new File("data.csv"));
        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
        UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);
        Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);
        for (LongPrimitiveIterator users = model.getUserIDs(); users.hasNext(); ) {
            long userId = users.nextLong();
            List<RecommendedItem> recommendations = recommender.recommend(userId, 2);

            System.out.println("User " + userId + " recommendations:");
            for (RecommendedItem item : recommendations) {
                System.out.println("  Item: " + item.getItemID() + " Score: " + item.getValue());
            }
        }
    }
}
