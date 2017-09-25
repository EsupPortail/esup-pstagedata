package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.StatisticItem;
import org.esupportail.pstagedata.domain.dto.StatisticItemDTO;
/**
 *
 * Gestion des stats dto
 *
 */
public interface StatisticsDtoManager {
	StatisticItemDTO createStatisticItemDTO();
	List <StatisticItemDTO> transformToDto(List<StatisticItem>  stats);

}
