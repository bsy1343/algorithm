# [Gold III] Lasagna - 34597

[문제 링크](https://www.acmicpc.net/problem/34597)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 9, 정답 비율: 81.818%

### 분류

수학, 순열 사이클 분할, 조화수

### 문제 설명

<p>Ovih se dana moglo naići na clickbait naslov “Znamo o čemu je Baby Lasagna razmišljao dok je čekao rezultate glasanja”. Kako nismo kliknuli na naslov, ne znamo što je odgovor. Možda je razmišljao o tome da naziv tradicionalnog talijanskog jela lazanje potječe od grčke riječi laganon, koja označava plosnatu “ploču” od tijesta izrezanu na trake? A možda je samo smišljao rješenje sljedećeg zadatka.</p>

<p>U zamišljenom svemiru postoji $N$ planeta označenih prirodnim brojevima od $1$ do $N$. U nultoj sekundi je na svakom planetu po jedan čovjek, označen istom oznakom. U svakoj od sljedećih $M$ sekundi će se ljudi s trenutnih teleportirati<sup>1</sup> na odredišne planete. Na svakom planetu je po jedan stroj za teleportiranje i prema svakom planetu je moguća teleportacija iz točno jednog planeta.</p>

<p>Tvoj je zadatak odrediti koliko će u sljedećih $M$ sekundi najviše ljudi istovremeno biti na svojim izvornim planetima.</p>

<hr>
<p><sup>1</sup> Teleportacija – trenutni prijenos materije s jednog na drugo mjesto uz primjenu tehnologije</p>

### 입력

<p>U prvom retku su prirodni brojevi $N$ i $M$ ($1 ≤ N, M ≤ 1\, 000\, 000$), brojevi iz teksta zadatka.</p>

<p>U drugom retku je $N$ različitih prirodnih brojeva koji redom predstavljaju oznake odredišnih planeta za teleportacijske strojeve na svakom od $N$ planeta.</p>

### 출력

<p>Ispiši traženi broj.</p>

### 힌트

<p>Opis prvog probnog primjera: Tablica za svaku sekundu i svakog čovjeka opisuje na kojem se planetu u određenoj sekundi nalazio određeni čovjek.</p>

<table class="table table-bordered table-center-50 td-center th-center">
<tbody>
<tr>
<th> </th>
<th>čovjek $1$</th>
<th>čovjek $2$</th>
<th>čovjek $3$</th>
<th>čovjek $4$</th>
<th>čovjek $5$</th>
</tr>
<tr>
<th>$1$. sekunda</th>
<td>$5$</td>
<td>$1$</td>
<td>$4$</td>
<td>$3$</td>
<td>$2$</td>
</tr>
<tr>
<th>$2$. sekunda</th>
<td>$2$</td>
<td>$5$</td>
<td>$3$</td>
<td>$4$</td>
<td>$1$</td>
</tr>
<tr>
<th>$3$. sekunda</th>
<td>$1$</td>
<td>$2$</td>
<td>$4$</td>
<td>$3$</td>
<td>$5$</td>
</tr>
<tr>
<th>$4$. sekunda</th>
<td>$5$</td>
<td>$1$</td>
<td>$3$</td>
<td>$4$</td>
<td>$2$</td>
</tr>
<tr>
<th>$5$. sekunda</th>
<td>$2$</td>
<td>$5$</td>
<td>$4$</td>
<td>$3$</td>
<td>$1$</td>
</tr>
</tbody>
</table>

<p>U prvih pet sekundi ih je najviše na svojem izvornom planetu bilo troje, i to u trećoj sekundi.</p>

<p>Opis drugog probnog primjera: Već u drugoj sekundi je svih petero ljudi bilo na svom izvornom planetu.</p>