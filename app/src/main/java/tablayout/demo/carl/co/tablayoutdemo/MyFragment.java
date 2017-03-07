package tablayout.demo.carl.co.tablayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Host-0 on 2017/3/7.
 */

public class MyFragment extends Fragment {
    private TextView mTextView;
    private String text;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        text = args!=null?args.getString("text"):"";
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view,container,false);
        mTextView = (TextView)view.findViewById(R.id.textView);
        mTextView.setText(text);
        return view;
    }
}
