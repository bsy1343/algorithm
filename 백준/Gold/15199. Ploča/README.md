# [Gold II] Ploča - 15199

[문제 링크](https://www.acmicpc.net/problem/15199)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

자료 구조, 분리 집합, 그리디 알고리즘

### 문제 설명

<p>Mirko je vlasnik neravnog zemlji&scaron;ta dimenzija R &times; S metara koje je popločano sa R &middot; S ploča dimenzija 1 &times; 1 metar. Budući da je zemlji&scaron;te neravno, svaka ploča ima svoju visinu u centimetrima. Kažemo da su dvije ploče susjedne ako dijele zajedničku stranicu (svaka ploča ima najvi&scaron;e četiri susjedne). Kažemo da su dvije ploče povezane ako s prve možemo doći na drugu pri čemu u svakom koraku prelazimo s ploče na kojoj se nalazimo na njoj susjednu ploču iste visine.</p>

<p>Uslijed nezapamćene oluje na Mirkovo zemlji&scaron;te počeli su padati veliki komadi leda iz najvi&scaron;eg dijela atmosfere, &scaron;to nije dobra vijest budući da je Mirko bio kupovao najjeftinije kineske ploče i njihovu ugradnju bio prepustio izvjesnom harmonika&scaron;u Hamdiji. Stoga, kada komad leda padne na neku ploču, zbog siline udarca on će za 1 centimetar sniziti tu ploču i sve ploče koje su s njome povezane. Mirko je ipak optimist pa se nada da će mu ti udarci poravnati zemlji&scaron;te.</p>

<p>Va&scaron; je zadatak preuzeti Mirkov optimizam i izračunati najmanji mogući broj komada leda koji mogu pasti tako da na kraju sve Mirkove ploče budu iste visine. Pretpostavljamo da će svaki komad leda pasti u različitom trenutku i samo na jednu ploču.</p>

### 입력

<p>U prvom redu nalaze prirodni brojevi R i S (2 &le; R, S &le; 1 000) &mdash; dimenzije zemlji&scaron;ta. Slijedi R redova od po S prirodnih brojeva iz intervala [1, 10<sup>9</sup>] kojima su dane visine odgovarajućih ploča u centimetrima.</p>

### 출력

<p>Ispi&scaron;ite traženi minimalan broj udaraca leda nakon kojeg su sve ploče iste visine.</p>

### 힌트

<p>Nakon &scaron;to komad leda padne na sredi&scaron;nju ploču, sve ploče osim posljednje bit će visine 2. Nakon jo&scaron; jednog pada na sredi&scaron;nju ploču, sve su ploče visine 1.</p>