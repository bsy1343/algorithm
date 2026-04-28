# [Platinum III] Parada - 14077

[문제 링크](https://www.acmicpc.net/problem/14077)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

(분류 없음)

### 문제 설명

<p>Mirka je odu&scaron;evila vojna parada pro&scaron;le godine, a najvi&scaron;e su ga se dojmili, naravno, tenkovi. Zbog toga je odlučio aktivno sudjelovati u organizaciji iste iduće godine. Parada će se odvijati kao procesija kroz grad gdje se sve vojne postrojbe, uključujući i tenkove, kreću redom po unaprijed odabranim prometnicama bez vraćanja na isto mjesto.</p>

<p>Mirkov je osobni cilj da na paradi bude &scaron;to je moguće vi&scaron;e tenkova (označimo taj broj sa T). Međutim, problem s tenkovima je da su te&scaron;ki pa uni&scaron;tavaju prometnice po kojima prolaze. Sve su prometnice dvosmjerne i svaka povezuje dva raskrižja, a za prometnicu i je poznato koliko tenkova može proći po njoj (označimo taj broj sa T<sub>i</sub>) prije nego &scaron;to će je trebati početi popravljati. Nakon toga, cijena popravka te prometnice raste kvadratno s brojem tenkova, odnosno jednaka je C<sub>i</sub>*(T-T<sub>i</sub>)<sup>2</sup> tisuća kuna, gdje je C<sub>i</sub> koeficijent cijene popravka prometnice.</p>

<p>Na sreću, postoji godi&scaron;nji budžet od K tisuća kuna za obnovu prometnica koji se može ciljano iskoristiti upravo za obnovu prometnica po kojima će prolaziti tenkovi. Mirku stoga treba pomoć u organzaciji rute po kojoj će se kretati parada tako da se maksimizira broj tenkova, a da se ne prekorači budžet za popravak prometnica. Dodatno je ograničenje da parada mora početi na raskrižju 1, zavr&scaron;iti na raskrižju N, a zajamčeno je da će postojati barem jedan takav put.&nbsp;</p>

### 입력

<p>U prvome retku nalaze se prirodni brojevi N, M i K (2 &le; N &le; 100 000, N-1 &le; M &le; 100 000, 1 &le; K &le; 10<sup>9</sup> ), broj raskrižja, broj prometnica i budžet u tisućama kuna.</p>

<p>U idućih M redaka nalaze se po četiri cijela broja: A<sub>i</sub>, B<sub>i</sub>, C<sub>i</sub> i T<sub>i</sub> (1 &le; A<sub>i</sub> &lt; B<sub>i</sub> &le; N, 1 &le; C<sub>i</sub>, T<sub>i</sub> &le; 1000), redom raskrižja koje povezuje prometnica i, faktor težine popravka te broj tenkova koji može po njoj proći bez potrebe za popravljanjem. Ne postoji vi&scaron;e od jedne prometnice koje povezuje dva raskrižja.&nbsp;</p>

### 출력

<p>Potrebno je ispisati koliko najvi&scaron;e tenkova može sudjelovati na paradi tako da popravak ne ko&scaron;ta vi&scaron;e od predviđenog budžeta K.&nbsp;</p>