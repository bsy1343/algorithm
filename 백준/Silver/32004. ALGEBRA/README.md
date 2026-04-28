# [Silver V] ALGEBRA - 32004

[문제 링크](https://www.acmicpc.net/problem/32004)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 33, 맞힌 사람: 30, 정답 비율: 85.714%

### 분류

구현

### 문제 설명

<p>Neka je zadano N nizova prirodnih brojeva. Za svaki niz unaprijed znamo koliko ima članova. Rije&scaron;i sljedeće izazove.</p>

<p><strong>Izazov #1</strong></p>

<p>Kada bi sve zadane nizove napisali jedan iza drugog, koliko bi onda bilo napisanih brojeva?</p>

<p><strong>Izazov #2</strong></p>

<p>Koliki je zbroj brojeva koji se nalaze i u A-tom i u B-tom nizu? Brojevi koji se ponavljanju u nizovima zbrajaju se samo jednom.</p>

<p><strong>Izazov #3</strong></p>

<p>Dva niza spajamo u jedan na način da usporedimo vrijednosti članova na odgovarajućim pozicijama (prvoj, drugoj..) u nizovima koje spajamo te u novi spojen niz na tu poziciju stavimo veću od dvije promatrane vrijednosti. Ako u nekom od dva niza nema neke pozicije, tada se kao vrijednost novog niza na toj poziciji uzima vrijednost pozicije u nizu gdje ta pozicija postoji.</p>

<p>Zadanih N nizova spoji u jedan na način da redom nizove spaja&scaron; po parovima (prvi s drugim, treći s četvrtim..) i postupak ponavlja&scaron; sve dok ti ne ostane jedan niz.</p>

### 입력

<p>U prvom je retku prirodan broj N (1 &le; N &le; 128, N je potencija broja 2), broj iz teksta zadatka.</p>

<p>U drugom su retku prirodni brojevi A i B (1 &le; A &lt; B &le; N), brojevi iz teksta zadatka.</p>

<p>U sljedećih N redaka nalazi se po niz prirodnih brojeva, gdje prvi broj u nizu M (1 &le; M &le; 99) definira koliko u tom nizu ima brojeva tj. broj prirodnih brojeva Xi (1 &le; Xi &le; 99), koji slijedi u nastavku retka.</p>

### 출력

<p>U prvi redak ispi&scaron;i prirodan broj, odgovor na prvi izazov iz teksta zadatka.</p>

<p>U drugi redak ispi&scaron;i cijeli broj, odgovor na drugi izazov iz teksta zadatka.</p>

<p>U treći redak ispi&scaron;i niz prirodnih brojeva, vrijednosti zavr&scaron;nog spojenog niza na prvoj, drugoj,.. te zadnjoj poziciji.</p>

### 힌트

<p>Opis prvog probnog primjera: Kada bi jedan iza drugoga napisali oba niza, tada bi imali osam napisanih brojeva. U prvom i drugom nizu pojavljuje se vrijednost 2. Spajanjem oba niza u jedan dobili bi [6 (24), 5 (5&gt;2), 3, 1].</p>

<p>Opis drugog probnog primjera: Kada bi jedan iza drugoga napisali sva četiri niza, tada bi imali 21 napisan broj. Brojevi koji se pojavljuju i u trećem i u četvrtom nizu su 2, 1 i 3. Spajanje nizova obavlja se na sljedeći način:</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Prva četiri niza</th>
			<th>Spojeni prvi i drugi, treći i četvrti</th>
			<th>spajanje dva nova niza</th>
		</tr>
		<tr>
			<td>
			<pre>
6 3 2 4 5
4 7
2 1 3 4 2 7
2 3 2 1 2 3 2 1</pre>
			</td>
			<td>
			<pre>
6 7 2 4 5
2 3 3 4 2 7 2 1</pre>
			</td>
			<td>
			<pre>
6 7 3 4 5 7 2 1</pre>
			</td>
		</tr>
	</tbody>
</table>