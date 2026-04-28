# [Gold V] Jabuka - 14092

[문제 링크](https://www.acmicpc.net/problem/14092)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 23, 맞힌 사람: 22, 정답 비율: 57.895%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Mirko i Slavko bave se izradom mobilnih aplikacija. Nakon izrade neočekivano dobro prihvaćene aplikacije FotoLektira koja na temelju nekoliko rečenica radi stilsku analizu knjige, ekipa je odlučna napraviti jo&scaron; jednu uspje&scaron;nicu.</p>

<p>Protitip nove igre koju razvijaju ima R x S ploču na kojoj su polja ili prazna ili zablokirana. Jedno od polja sadrži jabuku koja uvijek pada u smjeru gravitacije. U svakoj sekundi igrač može ekran okrenuti za 90 stupnjeva u smjeru kazaljke na satu, za 90 stupnjeva obrnuto od smjera kazaljke na satu ili može pričekati (ne napraviti ni&scaron;ta). Nakon toga jabuka padne jedno polje prema dolje (u smjeru gravitacije), ali samo ako polje ispod jabuke postoji (nije izvan ploče) i prazno je - inače jabuka ostaje na mjestu.</p>

<p>Va&scaron; zadatak je napraviti simulator igre, odnosno za početno stanje i niz koraka ispisati konačno stanje. Sljedeća tablica ilustrira jedan jednostavni primjer ove igre. U tablici znak &lsquo;#&rsquo; označava blokirano polje, znak &lsquo;.&rsquo; označava prazno polje, dok znak &lsquo;J&rsquo; označava poziciju jabuke.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14092.%E2%80%85Jabuka/0ef5c311.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14092/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-02%20%EC%98%A4%ED%9B%84%204.33.58.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:280px; width:500px" /></p>

### 입력

<p>U prvom retku nalaze se prirodni brojevi R i S (3 &le; R, S &le; 1000), broj redaka i stupaca ploče. U sljedećih R redaka nalazi se niz od točno S znakova gdje je svaki znak veliko slovo &lsquo;J&rsquo;, &lsquo;.&rsquo; (točka) ili &lsquo;#&rsquo;. Na ploči će se nalaziti točno jedan znak &lsquo;J&rsquo;.</p>

<p>U posljednjem retku ulaza nalazi se niz od najvi&scaron;e 1 000 000 znakova -- niz koraka. Svaki znak toga niza bit će jedan od sljedećih:</p>

<ul>
	<li>&lsquo;R&rsquo; - označava okret ekrana u smjeru kazaljke na satu</li>
	<li>&lsquo;L&rsquo; - označava okret ekrana u smjeru obrnutom od smjera kazaljke na satu</li>
	<li>&lsquo;P&rsquo; - označava čekanje&nbsp;</li>
</ul>

### 출력

<p>Ispi&scaron;ite R x S ili S x R tablicu (ovisno o konačnoj rotaciji) krajnjeg stanja ploče.&nbsp;</p>