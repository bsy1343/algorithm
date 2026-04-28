# [Gold III] Šetnja - 14091

[문제 링크](https://www.acmicpc.net/problem/14091)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

재귀

### 문제 설명

<p>Slavko je upravo popločao svoju kuhinju na matematički zanimljiv način. Na početku je njegova kuhinja jedna pločica oblika pravokutnika dimenzija 1x2 kao na slici:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14091.%E2%80%85%C5%A0etnja/9599542e.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14091.%E2%80%85%C5%A0etnja/9599542e.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14091/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-02%20%EC%98%A4%ED%9B%84%204.29.36.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:95px; width:184px" /></p>

<p>Zatim je N puta podijelio svaku pločicu na 4 manje pločice na sljedeći način. Nakon jedne podjele dobivamo pravokutnik dimenzija 2x4:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14091.%E2%80%85%C5%A0etnja/b9003a42.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14091.%E2%80%85%C5%A0etnja/b9003a42.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14091/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-02%20%EC%98%A4%ED%9B%84%204.29.46.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:94px; width:184px" /></p>

<p>Nakon druge podjele tako dobivamo pravokutnik dimenzija 4x8:&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14091.%E2%80%85%C5%A0etnja/7e860a31.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14091.%E2%80%85%C5%A0etnja/7e860a31.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14091/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-02%20%EC%98%A4%ED%9B%84%204.30.01.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:94px; width:184px" /></p>

<p>Nakon konačnog popločenja kuhinju možemo promatrati kao koordinatni sustav gdje svaka pločica pokriva točno dva polja. Polje u gornjem lijevom kutu nalazi se u prvom retku i prvom stupcu te ima koordinate (1, 1), dok polje u donjem desnom kutu ima koordinate (2<sup>N</sup>, 2<sup>N+1</sup>).</p>

<p>Nakon &scaron;to je popločio kuhinju Slavko je pro&scaron;etao po njenim poljima od početnog polja (R, S) nizom pomaka na jedno od 4 polja susjedna trenutačnome. Pomake predstavljamo znakovima:</p>

<ul>
	<li>&#39;L&#39; za pomak na susjedno polje lijevo.</li>
	<li>&#39;R&#39; za pomak na susjedno polje desno.</li>
	<li>&#39;U&#39; za pomak na susjedno polje gore.</li>
	<li>&#39;D&#39; za pomak na susjedno polje dolje.</li>
</ul>

<p>Nakon svakog Slavkovog pomaka odredite je li pre&scaron;ao između dvije pločice.&nbsp;</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N (0 &le; N &le; 20).</p>

<p>U drugom retku ulaza nalaze se dva prirodna broja R i S (1 &le; R &le; 2<sup>N</sup>, 1 &le; S &le; 2<sup>N+1</sup>), redak i stupac polja u kojemu se Slavko na početku nalazi.</p>

<p>U trećem retku ulaza nalazi se niz Slavkovih pomaka, označenih znakovima &#39;L&#39;, &#39;R&#39;, &#39;D&#39; i &#39;U&#39;. Niz pomaka neće biti duži od 100 000 znakova. Slavko neće napraviti pomak izvan pravokutnika.&nbsp;</p>

### 출력

<p>U jedinom retku ispi&scaron;ite niz znakova tako da je i-ti znak jednak &#39;Y&#39; ako je Slavko i-tim pomakom pre&scaron;ao između dvije pločice, a &#39;N&#39; ako je ostao na istoj pločici.&nbsp;</p>

### 힌트

<p>Slavkov put izgleda ovako:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14091.%E2%80%85%C5%A0etnja/588a8a64.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14091.%E2%80%85%C5%A0etnja/588a8a64.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14091/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-02%20%EC%98%A4%ED%9B%84%204.32.02.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:121px; width:230px" /></p>

<p>Zacrnjenim pomacima Slavko je pre&scaron;ao između dvije pločice.&nbsp;</p>