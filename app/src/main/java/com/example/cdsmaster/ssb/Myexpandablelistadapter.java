package com.example.cdsmaster.ssb;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.cdsmaster.R;

import java.util.List;
import java.util.Map;

public class Myexpandablelistadapter    extends BaseExpandableListAdapter {

    Context context;
    List<String>  faq;
   Map<String, List<String>>  content;


    public Myexpandablelistadapter(Context context, List<String> faq, Map<String, List<String>> content) {
        this.context = context;
        this.faq = faq;
        this.content = content;
    }

    @Override
    public int getGroupCount() {
        return faq.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return content.get(faq.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return faq.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return content.get(faq.get(groupPosition)).get(childPosition);

    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {


       String  faq=(String) getGroup(groupPosition);
       if(convertView==null)
       {
           LayoutInflater Inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
           convertView=Inflater.inflate(R.layout.groupitems,null);

       }

        TextView txtparent=(TextView) convertView.findViewById(R.id.groupitem);
       txtparent.setText(faq);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String  content=(String)    getChild(groupPosition,childPosition);

        if(convertView==null)
        {
            LayoutInflater Inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=Inflater.inflate(R.layout.child_items,null);

        }

        TextView child=(TextView) convertView.findViewById(R.id.childitem);
        child.setText(content);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
