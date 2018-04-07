package com.example.myglidetest;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.ColorFilterTransformation;
import jp.wasabeef.glide.transformations.CropCircleTransformation;
import jp.wasabeef.glide.transformations.CropSquareTransformation;
import jp.wasabeef.glide.transformations.CropTransformation;
import jp.wasabeef.glide.transformations.GrayscaleTransformation;
import jp.wasabeef.glide.transformations.MaskTransformation;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import jp.wasabeef.glide.transformations.gpu.BrightnessFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.ContrastFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.InvertFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.KuwaharaFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.PixelationFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SepiaFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SketchFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SwirlFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.ToonFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.VignetteFilterTransformation;

/**
 * Created by Administrator on 2016/10/28.
 */

public class GlideTranformationsAdapter extends RecyclerView.Adapter<GlideTranformationsAdapter.ViewHolder> {

    private Context mContext;
    private List<String> mData = new ArrayList<>();

    public GlideTranformationsAdapter(Context context) {
        mContext = context;
        for (int i = 1; i <= 21; i++) {
            mData.add(i + "");
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = View.inflate(mContext, R.layout.item_glide_tranformations, null);
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        // 设置名称
        holder.name.setText("item" + (position + 1));

        int integer = Integer.parseInt(mData.get(position));

        switch (integer) {
            case 1: {
                int width = com.example.myglidetest.Utils.dip2px(mContext,133.33f);
                int height = com.example.myglidetest.Utils.dip2px(mContext,126.33f);
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .override(width, height)//下载资源的宽高
                        .bitmapTransform(new CenterCrop(mContext),//从中间开始修剪
                                new MaskTransformation(mContext, R.drawable.mask_starfish))//把图片变成特定的形状
                        .into(holder.image);
                break;
            }
            case 2: {
                int width = com.example.myglidetest.Utils.dip2px(mContext, 150.0f);
                int height = com.example.myglidetest.Utils.dip2px(mContext, 100.0f);
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .override(width, height)
                        .bitmapTransform(new CenterCrop(mContext),//从中间开始修剪
                                new MaskTransformation(mContext, R.drawable.mask_chat_right))
                        .into(holder.image);
                break;
            }
            case 3:
                Glide.with(mContext)
                        .load(R.drawable.demo)
                        .bitmapTransform(
                                new CropTransformation(mContext, 300, 100, CropTransformation.CropType.TOP))//剪切变化参数
                        .into(holder.image);
                break;
            case 4:
                Glide.with(mContext)
                        .load(R.drawable.demo)
                        .bitmapTransform(new CropTransformation(mContext, 300, 100))
                        .into(holder.image);
                break;
            case 5:
                Glide.with(mContext)
                        .load(R.drawable.demo)
                        .bitmapTransform(
                                new CropTransformation(mContext, 300, 100, CropTransformation.CropType.BOTTOM))
                        .into(holder.image);

                break;
            case 6:
                Glide.with(mContext)
                        .load(R.drawable.demo)
                        .bitmapTransform(new CropSquareTransformation(mContext))//方形剪切
                        .into(holder.image);
                break;
            case 7:
                Glide.with(mContext)
                        .load(R.drawable.demo)
                        .bitmapTransform(new CropCircleTransformation(mContext))//圆形剪切
                        .into(holder.image);
                break;
            case 8:
                Glide.with(mContext)
                        .load(R.drawable.demo)
                        .bitmapTransform(new ColorFilterTransformation(mContext, Color.argb(80, 255, 0, 0)))//滤镜
                        .into(holder.image);
                break;
            case 9:
                Glide.with(mContext)
                        .load(R.drawable.demo)
                        .bitmapTransform(new GrayscaleTransformation(mContext))//黑白
                        .into(holder.image);
                break;
            case 10:
                Glide.with(mContext)
                        .load(R.drawable.demo)
                        .bitmapTransform(new RoundedCornersTransformation(mContext, 30, 0,
                                RoundedCornersTransformation.CornerType.BOTTOM))//圆角
                        .into(holder.image);
                break;
            case 11:
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .bitmapTransform(new BlurTransformation(mContext, 25))//模糊处理
                        .into(holder.image);
                break;
            case 12:
                Glide.with(mContext)
                        .load(R.drawable.demo)
                        .bitmapTransform(new ToonFilterTransformation(mContext))//卡通过滤
                        .into(holder.image);
                break;
            case 13:
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .bitmapTransform(new SepiaFilterTransformation(mContext))//乌墨色过滤
                        .into(holder.image);
                break;
            case 14:
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .bitmapTransform(new ContrastFilterTransformation(mContext, 2.0f))//对比过滤
                        .into(holder.image);
                break;
            case 15:
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .bitmapTransform(new InvertFilterTransformation(mContext))//黑白调换
                        .into(holder.image);
                break;
            case 16:
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .bitmapTransform(new PixelationFilterTransformation(mContext, 10))//像素过滤器
                        .into(holder.image);
                break;
            case 17:
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .bitmapTransform(new SketchFilterTransformation(mContext))//速写过滤
                        .into(holder.image);
                break;
            case 18:
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .bitmapTransform(
                                new SwirlFilterTransformation(mContext, 0.5f, 1.0f, new PointF(0.5f, 0.5f)))//旋转过滤
                        .into(holder.image);
                break;
            case 19:
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .bitmapTransform(new BrightnessFilterTransformation(mContext, 0.5f))//亮度过滤
                        .into(holder.image);
                break;
            case 20:
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .bitmapTransform(new KuwaharaFilterTransformation(mContext, 25))//（Kuwahara滤波器）
                        .into(holder.image);
                break;
            case 21:
                Glide.with(mContext)
                        .load(R.drawable.check)
                        .bitmapTransform(new VignetteFilterTransformation(mContext, new PointF(0.5f, 0.5f),//（装饰图滤波器）
                                new float[]{0.0f, 0.0f, 0.0f}, 0f, 0.75f))
                        .into(holder.image);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.iv_glide_tranfromations)
        ImageView image;

        @Bind(R.id.tv_glide_name)
        TextView name;

        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
