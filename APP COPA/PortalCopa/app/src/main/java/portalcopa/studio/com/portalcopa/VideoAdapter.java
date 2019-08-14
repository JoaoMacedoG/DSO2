package portalcopa.studio.com.portalcopa;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebChromeClient;
import android.view.LayoutInflater;

import com.google.android.gms.internal.ex;


public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    List<VideosYoutube> videosYoutubeList;

    public VideoAdapter() {

    }

    public VideoAdapter(List<VideosYoutube> videosYoutubeList) {
        this.videosYoutubeList = videosYoutubeList;
    }



        @Override
    public VideoAdapter.VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.videos_view, parent, false);

        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {
        holder.videoWeb.loadData (videosYoutubeList.get(position).getVideoUrl(), "text/html", "utf-8");

    }

    @Override
    public int getItemCount() {
        return videosYoutubeList.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder {

        WebView videoWeb;

        public VideoViewHolder(View itemView) {
            super(itemView);

            videoWeb = (WebView) itemView.findViewById(R.id.videosView);

            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient());

            }
        }
    }

