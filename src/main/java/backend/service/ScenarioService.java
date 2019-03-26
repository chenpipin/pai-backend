package backend.service;

//import model.*;

import backend.model.po.Edge;
import backend.model.po.NodePO;

import java.util.List;
import java.util.Map;

public interface ScenarioService {

    /** 根据算法名字（算法组件的简写）和对应的输入参数调用算法
     *
     * @param algorithmName
     * @param input
     * @return
     */
    Map callAlgorithm(String algorithmName, Map<String,Object> input);

    /**
     * @param experimentID
     * @return
     */
    List<Edge> findEdgesByExperimentID(Long experimentID) ;

    /**
     *
     * @param experimentID
     * @return
     */
    List<NodePO> findNodesByExperimentID(Long experimentID) ;

    /**
     *
     * @param nodePO
     * @return
     */
    String findAlgorithmNameByNode(NodePO nodePO) ;

//    Map<String,Object> formatInputForAlgorithm(NodePO node) ;

}
