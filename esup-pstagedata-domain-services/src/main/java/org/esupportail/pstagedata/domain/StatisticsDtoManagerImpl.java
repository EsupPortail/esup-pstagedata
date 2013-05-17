package org.esupportail.pstagedata.domain;

import java.util.ArrayList;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.StatisticItem;
import org.esupportail.pstagedata.domain.dto.StatisticItemDTO;

public class StatisticsDtoManagerImpl implements StatisticsDtoManager {

	@Override
	public StatisticItemDTO createStatisticItemDTO() {
		
		return new StatisticItemDTO();
	}
	
	public  List <StatisticItemDTO> transformToDto(List<StatisticItem>  stats){

		List<StatisticItemDTO>  statsDTO= null;
		StatisticItemDTO statisticItemDTO=null;
		if(stats!=null && stats.size() > 0){
			statsDTO = new ArrayList<StatisticItemDTO>(stats.size());
		for(StatisticItem itemstat : stats){
			 statisticItemDTO = createStatisticItemDTO();
			 statisticItemDTO.setStatisticItem(itemstat);
			 statsDTO.add(statisticItemDTO);
		}
		}
		return statsDTO;
	}

}
