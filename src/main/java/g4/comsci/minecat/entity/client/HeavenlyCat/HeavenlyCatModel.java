package g4.comsci.minecat.entity.client.HeavenlyCat;

import g4.comsci.minecat.entity.custom.HeavenlyCatEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class HeavenlyCatModel <T extends HeavenlyCatEntity> extends SinglePartEntityModel<T> {
	private final ModelPart HeavenlyCat;
	private final ModelPart head;

	public HeavenlyCatModel(ModelPart root) {
		this.HeavenlyCat = root.getChild("HeavenlyCat");
		this.head = this.HeavenlyCat.getChild("head");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData HeavenlyCat = modelPartData.addChild("HeavenlyCat", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData head = HeavenlyCat.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, new Dilation(0.0F))
				.uv(0, 24).cuboid(-1.5F, -0.02F, -4.0F, 3.0F, 2.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 10).cuboid(-2.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(6, 10).cuboid(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -9.0F, -9.0F));

		ModelPartData body = HeavenlyCat.addChild("body", ModelPartBuilder.create().uv(20, 0).cuboid(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -12.0F, -10.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData front_left_leg = HeavenlyCat.addChild("front_left_leg", ModelPartBuilder.create().uv(40, 0).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.1F, -9.9F, -5.0F));

		ModelPartData front_right_leg = HeavenlyCat.addChild("front_right_leg", ModelPartBuilder.create().uv(40, 0).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.1F, -9.9F, -5.0F));

		ModelPartData back_left_leg = HeavenlyCat.addChild("back_left_leg", ModelPartBuilder.create().uv(8, 13).cuboid(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.1F, -6.0F, 5.0F));

		ModelPartData back_right_leg = HeavenlyCat.addChild("back_right_leg", ModelPartBuilder.create().uv(8, 13).cuboid(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.1F, -6.0F, 5.0F));

		ModelPartData tail = HeavenlyCat.addChild("tail", ModelPartBuilder.create().uv(0, 15).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.5F, 8.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData tail2 = HeavenlyCat.addChild("tail2", ModelPartBuilder.create().uv(4, 15).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.5F, 16.0F, 1.5708F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 32);
	}

	@Override
	public void setAngles(HeavenlyCatEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		HeavenlyCat.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return HeavenlyCat;
	}
}