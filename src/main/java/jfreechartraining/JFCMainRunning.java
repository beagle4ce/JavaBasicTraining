package jfreechartraining;

import java.awt.BasicStroke;
import java.awt.Color;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

public class JFCMainRunning {

    public static void main(String[] args) {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        String itemA = "First";
        defaultCategoryDataset.addValue(1000.0D, itemA, "05-01");
        defaultCategoryDataset.addValue(1030.3D, itemA, "05-02");
        defaultCategoryDataset.addValue(1400.0D, itemA, "05-03");
        defaultCategoryDataset.addValue(1500.0D, itemA, "05-04");
        defaultCategoryDataset.addValue(1600.0D, itemA, "05-05");
        defaultCategoryDataset.addValue(1200.0D, itemA, "05-06");
        defaultCategoryDataset.addValue(1500.0D, itemA, "05-07");

        JFreeChart jFreeChart = ChartFactory.createLineChart("Title", "Type",
                "Value", defaultCategoryDataset, PlotOrientation.VERTICAL, true, true, false);
        
        CategoryPlot categoryPlot = jFreeChart.getCategoryPlot();
        categoryPlot.setBackgroundPaint(Color.white);
        categoryPlot.setRangeGridlinesVisible(false);
        categoryPlot.setRangeGridlinePaint(Color.blue);
        
        CategoryAxis categoryAxis = categoryPlot.getDomainAxis();
        categoryAxis.setAxisLineStroke(new BasicStroke(6.0f));//设置轴的粗细
        
        LineAndShapeRenderer lineAndShapeRenderer = (LineAndShapeRenderer)categoryPlot.getRenderer();
        lineAndShapeRenderer.setBaseShapesVisible(true);// 设置节点是否显示
        
        lineAndShapeRenderer.setDrawOutlines(true);
        lineAndShapeRenderer.setUseFillPaint(true);
        lineAndShapeRenderer.setBaseItemLabelsVisible(true);
        lineAndShapeRenderer.setStroke(new BasicStroke(6.0f));// 设置折线的粗细
        lineAndShapeRenderer.setBaseItemLabelsVisible(true);
        lineAndShapeRenderer.setBasePositiveItemLabelPosition(
                new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12,TextAnchor.BASELINE_CENTER));
        lineAndShapeRenderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        
        
        ChartFrame chartFrame = new ChartFrame("标题", jFreeChart,true);
        chartFrame.pack();
        chartFrame.setVisible(true);
    }

}