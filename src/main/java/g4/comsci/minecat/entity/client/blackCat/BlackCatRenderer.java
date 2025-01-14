package g4.comsci.minecat.entity.client.blackCat;

import g4.comsci.minecat.MineCat;
import g4.comsci.minecat.entity.client.ModModelLayers;
import g4.comsci.minecat.entity.custom.CatEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class BlackCatRenderer extends MobEntityRenderer<CatEntity, BlackCatModel<CatEntity>> {
    private static final Identifier TEXTURE = new Identifier(MineCat.MOD_ID, "textures/entity/cat1.png");

    public BlackCatRenderer(EntityRendererFactory.Context context) {
        super(context, new BlackCatModel<>(context.getPart(ModModelLayers.CAT1)), 0.6f);
    }

    @Override
    public Identifier getTexture(CatEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CatEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()){
            matrixStack.scale(0.4f,0.4f,0.4f);
        } else{
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
