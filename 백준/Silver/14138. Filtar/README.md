# [Silver I] Filtar - 14138

[문제 링크](https://www.acmicpc.net/problem/14138)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 10, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

해 구성하기

### 문제 설명

<p>Digitalni signal možemo zamisliti kao funkciju koja svakom cijelum broju k pridružuje cijeli broj u[k]. Kako bi (beskonačne) signale predstavili uz pomoć konačno mnogo brojeva, koristimo se interpolacijom. Naime, neke vrijednosti ćemo eksplicitno zadati, dok ćemo ostale vrijednosti izračunati linearnom interpolacijom.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14138.%E2%80%85Filtar/eba66b23.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14138/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%202.37.13.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:154px; width:212px" /></p>

<p>Na primjer, signal na gornjoj slici možemo predstaviti točkama (&minus;2, 3), (0, 1), (3, 7) i (5, 7), odnosno poznato nam je samo u[&minus;2] = 3, u[0] = 1, u[3] = 7 i u[5] = 7. Ostale vrijednosti dobivamo provlačenjem pravaca kroz susjedne točke. Tako na primjer:</p>

<ul>
	<li>Vrijednosti na intervalu &lt;&minus;&infin;, 0] izračunavamo pomoću pravca koji prolazi točkama (&minus;2, 3) i (0, 1).</li>
	<li>Vrijednosti na intervalu [0, 3] izračunavamo pomoću pravca koji prolazi točkama (0, 1) i (3, 7).</li>
	<li>Vrijednosti na intervalu [3, &infin;&gt; izračunavamo pomoću pravca koji prolazi točkama (3, 7) i (5, 7).</li>
</ul>

<p>Primijetimo da isti signal možemo opisati sa proizvoljno mnogo točaka, sve dok pravci koji prolaze susjednim točkama točno interpoliraju signal.</p>

<p>Za uklanjanje &scaron;uma u signalima često se koriste median filtri. Median filtar &scaron;irine 2&middot;d+1 sustav je koji na ulaz prima signal u[k], a na izlaz daje signal y[k] = median{ u[k-i]; &ndash;d &le; i &le; d }.</p>

<p>Drugim riječima, y[k] dobivamo tako da sortiramo vrijednosti u[k-d], u[k-d+1], ..., u[k+d] te u sortiranom nizu odaberemo vrijednost u sredini niza.</p>

<p>Slike na lijevoj strani prikazuju ulazni signal, dok slike na desnoj strani odgovarajući izlazni signal za &scaron;irinu filtra jednaku 5.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14138.%E2%80%85Filtar/036d5f4a.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14138/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%202.38.28.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:138px; width:283px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14138.%E2%80%85Filtar/85d39be9.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14138/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%202.38.39.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:137px; width:283px" /><br />
<img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14138.%E2%80%85Filtar/591b3625.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14138/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%202.38.50.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:136px; width:283px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14138.%E2%80%85Filtar/1ed221cf.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14138/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%202.38.58.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:137px; width:283px" /></p>

<p>Napi&scaron;ite program koji će izračunati izlazni signal iz median filtra &scaron;irine 2&middot;d+1 ako je ulazni signal zadan točkama. Na izlaz je dozvoljeno ispisati proizvoljan broj točaka, sve dok je on manji od 100 000 i dok točke ispravno interpoliraju izlazni signal.&nbsp;</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N (2 &le; N &le; 50), broj točaka koje opisuju ulazni digitalni signal.</p>

<p>U sljedećih N redaka nalaze se po dva cijela broja po apsolutnoj vrijednosti manja ili jednaka od 10<sup>9</sup> , koordinate točaka. Točke će biti zadane strogo uzlazno prema prvoj koordinati. Sve interpolirane vrijednosti bit će cjelobrojne.</p>

<p>U zadnjem retku nalazi se prirodni broj d (0 &le; d &le; 50), gdje je 2&middot;d+1 &scaron;irina median filtra.&nbsp;</p>

### 출력

<p>U prvi redak potrebno je ispisati prirodan broj M (2 &le; M &le; 100 000), broj točaka koje opisuju izlazni signal.</p>

<p>U sljedećih M redaka treba ispisati po dva cijela broja, koordinate točaka. Ispisani brojevi moraju stati u 64-bitni cjelobrojni tip podataka s predznakom. Točke moraju biti poredane strogo uzlazno prema prvoj koordinati.</p>

<p>Rje&scaron;enje nije jedinstveno.&nbsp;</p>

<p>&nbsp;</p>