// Generated code from Butter Knife. Do not modify!
package com.intfocus.yonghuitest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import com.github.mikephil.charting.charts.CombinedChart;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class HomeTricsActivity$$ViewBinder<T extends HomeTricsActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(Finder finder, T target, Object source) {
    return new InnerUnbinder<>(target, finder, source);
  }

  protected static class InnerUnbinder<T extends HomeTricsActivity> implements Unbinder {
    protected T target;

    private View view2131558569;

    private View view2131558573;

    private View view2131558581;

    private View view2131558579;

    protected InnerUnbinder(final T target, Finder finder, Object source) {
      this.target = target;

      View view;
      target.productRecyclerView = finder.findRequiredViewAsType(source, 2131558583, "field 'productRecyclerView'", RecyclerView.class);
      target.tvTitle = finder.findRequiredViewAsType(source, 2131558570, "field 'tvTitle'", TextView.class);
      target.mAnimLoading = finder.findRequiredViewAsType(source, 2131558527, "field 'mAnimLoading'", RelativeLayout.class);
      target.metricsRecyclerView = finder.findRequiredViewAsType(source, 2131558577, "field 'metricsRecyclerView'", RecyclerView.class);
      view = finder.findRequiredView(source, 2131558569, "field 'ivBack' and method 'onClick'");
      target.ivBack = finder.castView(view, 2131558569, "field 'ivBack'");
      view2131558569 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.rlTitle = finder.findRequiredViewAsType(source, 2131558568, "field 'rlTitle'", RelativeLayout.class);
      target.tvDataTitle = finder.findRequiredViewAsType(source, 2131558574, "field 'tvDataTitle'", TextView.class);
      target.llBottom = finder.findRequiredViewAsType(source, 2131558578, "field 'llBottom'", LinearLayout.class);
      target.tvDateTime = finder.findRequiredViewAsType(source, 2131558575, "field 'tvDateTime'", TextView.class);
      view = finder.findRequiredView(source, 2131558573, "field 'ivWarning' and method 'onClick'");
      target.ivWarning = finder.castView(view, 2131558573, "field 'ivWarning'");
      view2131558573 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.llDataTitle = finder.findRequiredViewAsType(source, 2131558572, "field 'llDataTitle'", RelativeLayout.class);
      view = finder.findRequiredView(source, 2131558581, "field 'tvSaleSort' and method 'onClick'");
      target.tvSaleSort = finder.castView(view, 2131558581, "field 'tvSaleSort'");
      view2131558581 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      view = finder.findRequiredView(source, 2131558579, "field 'tvNameSort' and method 'onClick'");
      target.tvNameSort = finder.castView(view, 2131558579, "field 'tvNameSort'");
      view2131558579 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.onClick(p0);
        }
      });
      target.ivNameSort = finder.findRequiredViewAsType(source, 2131558580, "field 'ivNameSort'", ImageView.class);
      target.ivSaleSort = finder.findRequiredViewAsType(source, 2131558582, "field 'ivSaleSort'", ImageView.class);
      target.combinedChart = finder.findRequiredViewAsType(source, 2131558631, "field 'combinedChart'", CombinedChart.class);
      target.rlChart = finder.findRequiredViewAsType(source, 2131558625, "field 'rlChart'", LinearLayout.class);
      target.tvMainData = finder.findRequiredViewAsType(source, 2131558626, "field 'tvMainData'", TextView.class);
      target.tvMainDataName = finder.findRequiredViewAsType(source, 2131558627, "field 'tvMainDataName'", TextView.class);
      target.tvSubData = finder.findRequiredViewAsType(source, 2131558628, "field 'tvSubData'", TextView.class);
      target.tvRateOfChange = finder.findRequiredViewAsType(source, 2131558629, "field 'tvRateOfChange'", TextView.class);
      target.ivRateOfChange = finder.findRequiredViewAsType(source, 2131558630, "field 'ivRateOfChange'", ImageView.class);
    }

    @Override
    public void unbind() {
      T target = this.target;
      if (target == null) throw new IllegalStateException("Bindings already cleared.");

      target.productRecyclerView = null;
      target.tvTitle = null;
      target.mAnimLoading = null;
      target.metricsRecyclerView = null;
      target.ivBack = null;
      target.rlTitle = null;
      target.tvDataTitle = null;
      target.llBottom = null;
      target.tvDateTime = null;
      target.ivWarning = null;
      target.llDataTitle = null;
      target.tvSaleSort = null;
      target.tvNameSort = null;
      target.ivNameSort = null;
      target.ivSaleSort = null;
      target.combinedChart = null;
      target.rlChart = null;
      target.tvMainData = null;
      target.tvMainDataName = null;
      target.tvSubData = null;
      target.tvRateOfChange = null;
      target.ivRateOfChange = null;

      view2131558569.setOnClickListener(null);
      view2131558569 = null;
      view2131558573.setOnClickListener(null);
      view2131558573 = null;
      view2131558581.setOnClickListener(null);
      view2131558581 = null;
      view2131558579.setOnClickListener(null);
      view2131558579 = null;

      this.target = null;
    }
  }
}
