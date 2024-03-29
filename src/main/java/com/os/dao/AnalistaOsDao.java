package com.os.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.os.generico.GenericDao;
import com.os.model.OsChamado;

public class AnalistaOsDao extends GenericDao<OsChamado> {

	
	@SuppressWarnings("unchecked")
	public List<OsChamado> buscarChamadosEmDesenvolvimento(String analista) {
		List<OsChamado> lista = new ArrayList<>();
		List<Object> listaObjeto = null;
		EntityManager em = getEntityManager();
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(" select os_id,os_status,os_data,os_tipo,os_titulo,os_usuabertura,os_analista,os_descricao,os_dataprevisao ");
			sb.append(" from os_chamado where os_status in(1,6) and os_analista = :analista order by os_status desc, os_data ");

			
			Query query = em.createNativeQuery(sb.toString());
			query.setParameter("analista", analista);
			listaObjeto = query.getResultList();
			
			for (int i = 0; i < listaObjeto.size(); i++) {
				Object[] result = (Object[]) listaObjeto.get(i);
				
				OsChamado model = new OsChamado();
				
				model.setOsId((Integer) result[0]);
				model.setStatusOs((Integer) result[1]);
				model.setDataOs((Date) result[2]);
				model.setTipoOs((Integer) result[3]);
				model.setTituloOs((String) result[4]);
				model.setUsuAberturaOs((String) result[5]);
				model.setAnalistaOs((String) result[6]);
				model.setDescricaoOs((String) result[7]);
				model.setDataPrevisaoOs((Date) result[8]);
				
				lista.add(model);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			em.close();
		}
		
		return lista;
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List<OsChamado> buscarChamadosAguardandoUsuarios(String analista) {
		List<OsChamado> lista = new ArrayList<>();
		List<Object> listaObjeto = null;
		EntityManager em = getEntityManager();
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(" select os_id,os_status,os_data,os_tipo,os_titulo,os_usuabertura,os_analista,os_descricao,os_dataprevisao ");
			sb.append(" from os_chamado where os_status = 2 and os_analista = :analista ");
			
			Query query = em.createNativeQuery(sb.toString());
			query.setParameter("analista", analista);
			listaObjeto = query.getResultList();
			
			for (int i = 0; i < listaObjeto.size(); i++) {
				Object[] result = (Object[]) listaObjeto.get(i);
				
				OsChamado model = new OsChamado();
				
				model.setOsId((Integer) result[0]);
				model.setStatusOs((Integer) result[1]);
				model.setDataOs((Date) result[2]);
				model.setTipoOs((Integer) result[3]);
				model.setTituloOs((String) result[4]);
				model.setUsuAberturaOs((String) result[5]);
				model.setAnalistaOs((String) result[6]);
				model.setDescricaoOs((String) result[7]);
				model.setDataPrevisaoOs((Date) result[8]);
				
				lista.add(model);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			em.close();
		}
		
		return lista;
		
	}
	
	@SuppressWarnings("unchecked")	
	public List<OsChamado> buscarChamadosAguardandoTerceiros(String analista) {
		List<OsChamado> lista = new ArrayList<>();
		
		List<Object> listaObjeto = null;
		EntityManager em = getEntityManager();
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(" select os_id,os_status,os_data,os_tipo,os_titulo,os_usuabertura,os_analista,os_descricao,os_dataprevisao ");
			sb.append(" from os_chamado where os_status = 3 and os_analista = :analista ");
			
			Query query = em.createNativeQuery(sb.toString());
			query.setParameter("analista", analista);
			
			listaObjeto = query.getResultList();
			
			for (int i = 0; i < listaObjeto.size(); i++) {
				Object[] result = (Object[]) listaObjeto.get(i);
				
				OsChamado model = new OsChamado();
				
				model.setOsId((Integer) result[0]);
				model.setStatusOs((Integer) result[1]);
				model.setDataOs((Date) result[2]);
				model.setTipoOs((Integer) result[3]);
				model.setTituloOs((String) result[4]);
				model.setUsuAberturaOs((String) result[5]);
				model.setAnalistaOs((String) result[6]);
				model.setDescricaoOs((String) result[7]);
				model.setDataPrevisaoOs((Date) result[8]);
				
				lista.add(model);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			em.close();
		}
		
		return lista;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<OsChamado> buscarChamadosEmTeste(String analista) {
		List<OsChamado> lista = new ArrayList<>();
		List<Object> listaObjeto = null;
		EntityManager em = getEntityManager();
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(" select os_id,os_status,os_data,os_tipo,os_titulo,os_usuabertura,os_analista,os_descricao,os_dataprevisao ");
			sb.append(" from os_chamado where os_status = 4 and os_analista = :analista ");
			
			Query query = em.createNativeQuery(sb.toString());
			query.setParameter("analista", analista);
			listaObjeto = query.getResultList();
			
			for (int i = 0; i < listaObjeto.size(); i++) {
				Object[] result = (Object[]) listaObjeto.get(i);
				
				OsChamado model = new OsChamado();
				
				model.setOsId((Integer) result[0]);
				model.setStatusOs((Integer) result[1]);
				model.setDataOs((Date) result[2]);
				model.setTipoOs((Integer) result[3]);
				model.setTituloOs((String) result[4]);
				model.setUsuAberturaOs((String) result[5]);
				model.setAnalistaOs((String) result[6]);
				model.setDescricaoOs((String) result[7]);
				model.setDataPrevisaoOs((Date) result[8]);
				
				lista.add(model);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			em.close();
		}
		
		return lista;
		
	}
	
	
	public BigInteger buscarQuantidadeDeChamadosEmDesenvolvimento(){
		
		BigInteger valor = null;

		EntityManager em = getEntityManager();
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(" select  ");
			sb.append(" count(os_id) ");

			sb.append(" from ");
			sb.append(" os_chamado ");

			sb.append(" where os_status in(1,6) ");
			sb.append(" and not os_analista is null ");
			
			Query query = em.createNativeQuery(sb.toString());
			valor = (BigInteger) query.getSingleResult();
			

			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			em.close();
		}
		
		return valor;
	}
	
	
	public BigInteger buscarQuantidadeDeChamadosAguardandoUsuario(){
		
		BigInteger valor = null;

		EntityManager em = getEntityManager();
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(" select  ");
			sb.append(" count(os_id) ");

			sb.append(" from ");
			sb.append(" os_chamado ");

			sb.append(" where os_status = 2 ");

			
			Query query = em.createNativeQuery(sb.toString());
			valor = (BigInteger) query.getSingleResult();
			

			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			em.close();
		}
		
		return valor;
	}
	
	
	public BigInteger buscarQuantidadeDeChamadosAguardandoTerceiros(){
		
		BigInteger valor = null;

		EntityManager em = getEntityManager();
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(" select  ");
			sb.append(" count(os_id) ");

			sb.append(" from ");
			sb.append(" os_chamado ");

			sb.append(" where os_status = 3");

			
			Query query = em.createNativeQuery(sb.toString());
			valor = (BigInteger) query.getSingleResult();
			

			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			em.close();
		}
		
		return valor;
	}
	

	public BigInteger buscarQuantidadeDeChamadosEmTeste(){
		
		BigInteger valor = null;

		EntityManager em = getEntityManager();
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(" select  ");
			sb.append(" count(os_id) ");

			sb.append(" from ");
			sb.append(" os_chamado ");

			sb.append(" where os_status = 4 ");

			
			Query query = em.createNativeQuery(sb.toString());
			valor = (BigInteger) query.getSingleResult();
			

			
		} catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			em.close();
		}
		
		return valor;
	}
	
	
	
	
}
