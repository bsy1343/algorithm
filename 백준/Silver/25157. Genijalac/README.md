# [Silver II] Genijalac - 25157

[문제 링크](https://www.acmicpc.net/problem/25157)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 14, 맞힌 사람: 13, 정답 비율: 86.667%

### 분류

구현, 정렬

### 문제 설명

<p>Dok je s Ljepoticom Nicol sastavljao namje&scaron;taj, Genijalac Ronald je razmi&scaron;ljao: &bdquo;Ako zvijezde mogu pjevati, ako zvijezde mogu plesati, za&scaron;to zvijezde ne bi mogle kodirati?&rdquo; Prionuo je poslu i osmislio pravila showa &bdquo;Zvijezde kodiraju&ldquo;.</p>

<p>U showu sudjeluje N zvijezda označenih brojevima od 1 do N. Show tj. zadatak je podijeljen na četiri dijela koji se nastavljaju jedan na drugi.</p>

<p>Dio 1.</p>

<p>Nakon &scaron;to zvijezde predstave svoje programerske vje&scaron;tine, publika u studiju glasa za neku od njih. Zvijezda s najvećim brojem dobivenih glasova postaje pobjednik prvog dijela showa. Ako vi&scaron;e zvijezda ima isti, a najveći broj glasova, pobjednik je ona s najmanjom oznakom.</p>

<p>U prvi redak izlaza ispi&scaron;i oznaku pobjednika prvog dijela showa.</p>

<p>Dio 2.</p>

<p>U drugom dijelu glasovi publike pretvaraju se u bodove. Zvijezda (jedna ili vi&scaron;e njih) s najvećim brojem glasova publike dobiva N bodova, zvijezda (jedna ili vi&scaron;e njih) sa sljedećim najvećim brojem glasova publike dobiva N - 1 bodova i tako redom sve dok svakoj zvijezdi ne pretvorimo glasove u bodove.</p>

<p>U drugi redak ispi&scaron;i najmanji broj bodova koji je dodijeljen nekoj zvijezdi.</p>

<p>Dio 3.</p>

<p>U trećem dijelu zvijezde dodatno ocjenjuje K članova žirija označenih brojevima od 1 do K. Svaki član žirija svakoj zvijezdi dodjeljuje između 1 i N glasova, dodijeliv&scaron;i svaki broj glasova točno jednom. Glasovi članova žirija se za svakog pojedinog natjecatelja zbrajaju. Nakon zbrajanja, glasovi se pretvaraju u bodove na isti način obja&scaron;njen u drugom dijelu. Zbrajanjem bodova iz drugog i trećeg dijela dobije se ukupan broj bodova koji pojedina zvijezda ima na kraju showa. Zvijezda s najvećim brojem ukupnih bodova postaje pobjednik cijelog showa. Ako vi&scaron;e zvijezda ima isti najveći broj bodova, pobjednik je ona među njima s najmanjom oznakom.</p>

<p>Ispi&scaron;i oznaku pobjednika showa.</p>

<p>Dio 4.</p>

<p>Službena ljestvica poretka dobije se sortiranjem zvijezda prema ukupnom broju bodova koje imaju (od većeg broja prema manjem). Zvijezde s istim brojem bodova sortiraju se prema vrijednosti njihove oznake (od manje prema većoj). U četvrtom dijelu određuje se koji je član žirija najbolje procijenio službenu ljestvicu poretka. Preciznije rečeno, to je onaj član žirija kod kojeg je minimalan zbroj apsolutnih vrijednosti razlike pozicije i-te zvijezde na službenoj ljestvici poretka i pozicije i-te zvijezde na ljestvici poretka kada bi se gledali samo glasovi tog člana žirija. Ako vi&scaron;e članova žirija ima isti minimalan zbroj traženih razlika, tada za onoga među njima koji ima najmanju oznaku kažemo da je najbolje procijenio pobjednika.</p>

<p>Ispi&scaron;i oznaku člana žirija s najboljom procjenom.</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N (2 &le; N &le; 100), broj zvijezda iz teksta zadatka.</p>

<p>U sljedećih N redaka nalazi se po jedan prirodan broj P<sub>i</sub> (1 &le; P<sub>i</sub> &le; 1000, i=1..N), ukupan broj glasova publike koji je dobila zvijezda s oznakom i.</p>

<p>U sljedećem retku nalazi se prirodan broj K (1 &le; K &le; 100), broj članova žirija iz teksta zadatka.</p>

<p>U sljedećih K redaka nalazi se po N različitih prirodnih brojeva Z<sub>ij</sub> (1 &le; Z<sub>ij</sub> &le; N, i=1..K, j=1..N) odvojenih razmakom, broj glasova koje je član žirija s oznakom i dodijelio zvijezdi s oznakom j.</p>

### 출력

<p>U prvi redak treba ispisati prirodan broj, rje&scaron;enje prvog dijela zadatka.</p>

<p>U drugi redak treba ispisati prirodan broj, rje&scaron;enje drugog dijela zadatka.</p>

<p>U treći redak treba ispisati prirodan broj, rje&scaron;enje trećeg dijela zadatka.</p>

<p>U četvrti redak treba ispisati prirodan broj, rje&scaron;enje četvrtog dijela zadatka.</p>

### 힌트

<p>Dio 1. Zvijezde s oznakama 8 i 9 imaju po 15 glasova publike. Pobjednik prvog dijela showa je zvijezda s manjom oznakom (8).</p>

<p>Dio 2. Nakon pretvaranja glasova u bodove najmanji broj bodova koji se dodijelio je 5.</p>

<p>Dio 3. Nakon glasanja članova žirija, zbrajanja glasova, pretvaranja u bodove i zbrajanja s bodovima iz drugog dijela showa, pobjednik showa je zvijezda s oznakom 9.</p>

<p>Dio 4. Članovi žirija s oznakama 1 i 4 imaju najmanji zbroj apsolutnih razlika pozicija (20). Ispisujemo člana žirija s najmanjom oznakom (1). Zbroj razlika za tog člana žirija je:</p>

<p>zbroj = |7 - 10| + |5 - 9| + |10 - 8| + |8 - 7| + |9 - 6| + |6 - 5| + |3 - 4| + |2 - 3| + |1 - 2| + |4 - 1|.</p>

<table class="table table-bordered th-center td-center">
	<thead>
		<tr>
			<th rowspan="2">oznaka zvijezde</th>
			<th>Dio 1.</th>
			<th>Dio 2.</th>
			<th colspan="3">Dio 3.</th>
			<th rowspan="2">službena ljestvica poretka</th>
		</tr>
		<tr>
			<th>glasovi publike</th>
			<th>glasovi publike pretvoreni u bodove</th>
			<th>zbrojen broj glasova članova žirija</th>
			<th>glasovi žirija pretvoreni u bodove</th>
			<th>ukupan broj bodova</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td>5</td>
			<td>6</td>
			<td>41</td>
			<td>7</td>
			<td>13</td>
			<td>7</td>
		</tr>
		<tr>
			<td>2</td>
			<td>6</td>
			<td>7</td>
			<td>44</td>
			<td>8</td>
			<td>15</td>
			<td>5</td>
		</tr>
		<tr>
			<td>3</td>
			<td>3</td>
			<td><span style="background-color:#ffff55;">5</span></td>
			<td>27</td>
			<td>5</td>
			<td>10</td>
			<td>10</td>
		</tr>
		<tr>
			<td>4</td>
			<td>6</td>
			<td>7</td>
			<td>27</td>
			<td>5</td>
			<td>12</td>
			<td>8</td>
		</tr>
		<tr>
			<td>5</td>
			<td>3</td>
			<td>5</td>
			<td>34</td>
			<td>6</td>
			<td>11</td>
			<td>9</td>
		</tr>
		<tr>
			<td>6</td>
			<td>7</td>
			<td>8</td>
			<td>34</td>
			<td>6</td>
			<td>14</td>
			<td>6</td>
		</tr>
		<tr>
			<td>7</td>
			<td>12</td>
			<td>9</td>
			<td>41</td>
			<td>7</td>
			<td>16</td>
			<td>3</td>
		</tr>
		<tr>
			<td>8</td>
			<td><span style="background-color:#ffff55;">15</span></td>
			<td>10</td>
			<td>41</td>
			<td>7</td>
			<td>17</td>
			<td>2</td>
		</tr>
		<tr>
			<td>9</td>
			<td>15</td>
			<td>10</td>
			<td>50</td>
			<td>10</td>
			<td>20</td>
			<td><span style="background-color:#ffff55;">1</span></td>
		</tr>
		<tr>
			<td>10</td>
			<td>6</td>
			<td>7</td>
			<td>46</td>
			<td>9</td>
			<td>16</td>
			<td>4</td>
		</tr>
	</tbody>
</table>