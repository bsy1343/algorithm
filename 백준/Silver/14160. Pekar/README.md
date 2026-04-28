# [Silver II] Pekar - 14160

[문제 링크](https://www.acmicpc.net/problem/14160)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 29, 정답: 21, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

그리디 알고리즘, 누적 합

### 문제 설명

<p>Pekar Pero privatizira pekaru &quot;Preko Puta&quot;, pije vino i ćevape guta. Pritom poku&scaron;ava pomoću svojih P pećnica ispeći puno peciva.</p>

<p>Peciva dolaze u raznim veličinama, kao i pećnice. Preciznije, pećnice su označene brojevima 1, 2, ..., P tako da najveća pećnica ima broj 1, druga po veličini broj 2 i tako dalje. Najveća peciva stanu samo u pećnicu broj 1, ona malo manja stanu i u pećnicu broj 2, a ona najmanja stanu u sve pećnice, uključujući i onu broj P.</p>

<p>U nekoj pećnici istovremeno se može peći i nekoliko peciva: u pećnici broj q može se odjednom peći najvi&scaron;e A<sub>q</sub> peciva, neovisno o njihovoj veličini (naravno, svako pojedino pecivo treba biti dovoljno maleno da stane u tu pećnicu). Sve pećnice mogu raditi istovremeno.</p>

<p>Pero treba ispeći T<sub>1</sub> peciva koja stanu samo u pećnicu 1 (dakle, najvećih peciva), T<sub>2</sub> peciva koja stanu i u pećnicu 1 i u pećnicu 2, ..., T<sub>P</sub> peciva koja stanu u sve pećnice.</p>

<p>Pećnica radi pet minuta da bi ispekla sva peciva koja se u njoj nalaze. Pomozite Peri da odredi koliko je najmanje vremena potrebno da bi ispekao sva peciva.&nbsp;</p>

### 입력

<p>U prvom retku nalazi se broj P &le; 100 000, broj pećnica (&scaron;to je ujedno i broj različitih veličina peciva). U sljedećem retku nalazi se P prirodnih brojeva T<sub>1</sub>, T<sub>2</sub> , ..., T<sub>P</sub> (svi su &le; 10<sup>12</sup>). Broj T<sub>q</sub> označava broj peciva koji se mogu ispeći u pećnici broj q ili većoj. U sljedećem retku nalazi se P prirodnih brojeva A<sub>1</sub>, A<sub>2</sub> , ..., A<sub>P</sub> (svi su &le; 10<sup>12</sup>). Broj A<sub>q</sub> označava koliko se najvi&scaron;e komada peciva može istovremeno peći u pećnici broj q.&nbsp;</p>

### 출력

<p>U prvi i jedini redak izlaza potrebno je ispisati jedan broj, traženo minimalno vrijeme pečenja u minutama.&nbsp;</p>

### 힌트

<p>pećnica ima kapacitet 3, pa će joj trebati 3 ture da bi ispekla 7 peciva. U prvoj i drugoj turi će ispeći po 3 peciva, dok će u zadnjoj turi peći samo jedno.&nbsp;</p>