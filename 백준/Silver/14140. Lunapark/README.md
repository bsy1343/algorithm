# [Silver IV] Lunapark - 14140

[문제 링크](https://www.acmicpc.net/problem/14140)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 30, 맞힌 사람: 30, 정답 비율: 69.767%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Mirko i Slavko su slobodan dan odlučili posvetiti posjetu lunaparku. Najveća atrakcija u lunaparku je vodeni tobogan. Nažalost, red u kojem se čeka na ulaz u vodeni tobogan je uvijek pun.</p>

<p>Sljedeća slika prikazuje primjer tlocrta reda u kojem se čeka 12 minuta. Početak reda je u polju 1.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/14140/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%202.42.22.png" style="height:133px; width:160px" /></p>

<p>Mirko je u&scaron;ao u red; sva mjesta ispred njega su puna. Nakon jedne minute, osoba na kraju reda ulazi na tobogan, svi u redu se pomiču unaprijed jedno mjesto i nova osoba ulazi u red.</p>

<p>Slavko se prije ulaska u red zaletio do &scaron;tanda s vrućim hrenovkama. Točno K minuta nakon Mirka, Slavko uspijeva ući u red.</p>

<p>Mirko i Slavko mogu čavrljati ako se nalaze na poljima susjednima u nekom od osam smjerova (gore, dolje, lijevo, desno te četiri dijagonalna smjera). Koliko minuta će provesti u čavrljanju?</p>

<p>U gornjem primjeru, ako Slavko u&ntilde;e u red dvije minute nakon Mirka, moći će čavrljati ukupno tri minute dok čekaju u redu:</p>

<ul>
	<li>dok je Mirko u polju 6, a Slavko u polju 4;</li>
	<li>dok je Mirko u polju 7, a Slavko u polju 5;</li>
	<li>dok je Mirko u polju 11, a Slavko u polju 9.&nbsp;</li>
</ul>

### 입력

<p>Prvi red sadrži duljinu reda L (2 &le; L &le; 250) i opis tlocrta reda, niz od L&minus;1 velikih slova. Niz opisuje put koji prije&ntilde;e svaki gost parka koji čeka u redu. Pojavljivat će se slova &#39;L&#39;, &#39;R&#39;, &#39;U&#39; i &#39;D&#39;, a označavaju pomicanje na polje lijevo, desno, gore i dolje od trenutnog.&nbsp;</p>

<p>Drugi red sadrži prirodni broj K (1 &le; K &lt; L), koliko minuta nakon Mirka je Slavko u&scaron;ao u red.</p>

<p>Niz slova u prvom redu ulaza će predstavljati valjani tlocrt reda, tj. red neće sjeći sam sebe.</p>

### 출력

<p>Ispi&scaron;ite koliko minuta će Mirko i Slavko biti dovoljno blizu da čavrljaju.&nbsp;</p>