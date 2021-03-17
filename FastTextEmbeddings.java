import org.apache.commons.lang.ArrayUtils;
import org.deeplearning4j.models.fasttext.FastText;
import java.io.File;

public class FastTextEmbeddings {
    final private File wiki_file = new File("./wiki.en.bin");
    final private FastText wiki_model = new FastText(wiki_file);

    public FastTextEmbeddings() {
    }

    public double[] getEmbeddings(String word1) {
        return double[] vec1 = this.wiki_model.getWordVector(word1);
    }

    public static void main(String args[]) {
        FastTextEmbeddings test = new FastTextEmbeddings();

        double[] test_result = test.getEmbeddings("love");

        for(int i=0; i<test_result.length;i++) {
            System.out.println(test_result[i]);
        }
    }
}
