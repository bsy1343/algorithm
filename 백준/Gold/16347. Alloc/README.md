# [Gold I] Alloc - 16347

[문제 링크](https://www.acmicpc.net/problem/16347)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 76, 정답: 41, 맞힌 사람: 33, 정답 비율: 52.381%

### 분류

구현, 자료 구조, 세그먼트 트리, 연결 리스트

### 문제 설명

<p>Napi&scaron;ite program koji će simulirati izvr&scaron;avanje naredbi za rezerviranje i oslobadanje memorije. Memorija računala je niz od 100 000 uzastopnih memorijskih lokacija, redom označenih adresama od 1 do 100 000. Na početku su sve lokacije slobodne. Naredbe koje se mogu pojaviti su:</p>

<ul>
	<li><code>var=malloc(s);</code> Ova naredba pronalazi prvi niz od <code>s</code> uzastopnih slobodnih memorijskih lokacija i rezervira ih. Funkcija vraća adresu prve rezervirane lokacije. Ako ne postoji niz od <code>s</code> uzastopnih slobodnih memorijskih lokacija, onda funkcija ni&scaron;ta ne rezervira te vraća vrijednost 0.</li>
	<li><code>free(var);</code> Ova naredba oslobada memorijske lokacije dodijeljene varijabli var (prethodnim pozivom funkcije <code>malloc</code>) i postavlja vrijednost varijable <code>var</code> na 0. Ako je vrijednost varijable <code>var</code> već&nbsp;jednaka 0 prije poziva funkcije, onda funkcija ne radi ni&scaron;ta.</li>
	<li><code>print(var);</code> Ova naredba ispisuje vrijednost varijable <code>var</code>.</li>
</ul>

<p>Svaka naredba zavr&scaron;ava znakom &ldquo;<code>;</code>&rdquo; (točkazarez). Varijable su nizovi sastavljeni od točno 4 mala slova engleske abecede. Sve varijable su na početku inicijalizirane na vrijednost 0.</p>

### 입력

<p>U prvom redu se nalazi cijeli broj n (1 &le; n &le; 100 000) &ndash; broj naredbi. U j-tom od sljedećih n redova se nalazi j-ta naredba, formatirana točno kao u tekstu zadatka bez vi&scaron;ka praznih znakova. Ukupni broj različitih varijabli će biti manji ili jednak od 1000. Barem jedna od naredbi će biti naredba <code>print</code>. U svakoj naredbi <code>malloc</code> vrijedi 100 &le; s &le; 100 000.</p>

### 출력

<p>U j-ti red ispi&scaron;ite rezultat j-te po redu naredbe <code>print</code>.</p>