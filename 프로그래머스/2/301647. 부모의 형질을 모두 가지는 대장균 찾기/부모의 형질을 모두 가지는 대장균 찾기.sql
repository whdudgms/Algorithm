-- 코드를 작성해주세요
select ch.id as ID, ch.genotype as GENOTYPE, pa.genotype as parent_genotype from ECOLI_DATA ch, ECOLI_DATA pa
where pa.id = ch.PARENT_ID AND 
-- 부모 형질을 자식 형질이 가지고 있는지가 궁금하다. 
ch.GENOTYPE & pa.GENOTYPE = pa.GENOTYPE
order by ch.id asc;