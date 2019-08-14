package portalcopa.studio.com.portalcopa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class Video extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<VideosYoutube> videosYoutube = new Vector<VideosYoutube>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        videosYoutube.add( new VideosYoutube("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zmt-TjvEFG0\" frameborder=\"0\"  encrypted-media\" allowfullscreen></iframe>") );
        videosYoutube.add( new VideosYoutube("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/g1Ybv8EhlP4\" frameborder=\"0\"  encrypted-media\" allowfullscreen></iframe>") );
        videosYoutube.add( new VideosYoutube("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Vm-avsAjrIo\" frameborder=\"0\"  encrypted-media\" allowfullscreen></iframe>") );
        videosYoutube.add( new VideosYoutube("<iframe width=\"100%\" height=\"90%\" src=\"https://www.youtube.com/embed/gVrQczo3uRg\" frameborder=\"0\"  encrypted-media\" allowfullscreen></iframe>") );
        VideoAdapter videoAdapter = new VideoAdapter(videosYoutube);
        recyclerView.setAdapter(videoAdapter);

    }
}
