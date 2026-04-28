# [Gold V] Avio Algoritam - 31188

[문제 링크](https://www.acmicpc.net/problem/31188)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Na&scaron;e nacionalno blago, <em>Croatia Airlines</em>, ulaže milijarde eura u sofisticirani algoritam koji će dodijeliti bolja zrakoplovna sjedala onim putnicima koji su ranije kupili kartu.</p>

<p>Sjedala se u zrakoplovu protežu kroz $r$ redova, gdje je $r$ paran broj. Također postoje tri <em>izlazna reda</em> koji služe kao pristup izlazima u slučaju nužde, te ne sadrže sjedala. Prvi izlazni red nalazi se na samom početku zrakoplova (prije prvog reda sjedala), drugi se nalazi točno u sredini zrakoplova, a treći se nalazi na kraju zrakoplova (nakon posljednjeg reda sjedala). Redovi zrakoplova numerirani su prirodnim brojevima od $1$ do $r + 3$ koji rastu od početka prema kraju zrakoplova. Odnosno, redovi numerirani brojevima $1$, $r/2 + 2$ i $r + 3$ su izlazni redovi, dok svi ostali redovi sadrže sjedala.</p>

<p>Konfiguracija sjedala u zrakoplovu je <code>3-3-3</code>, odnosno svaki red sjedala sastoji se od tri grupe po tri sjedala između kojih se nalazi prolaz za putnike. Sjedala svakog retka označena su uzastopnim slovima prema sljedećem uzorku <code>ABC.DEF.GHI</code> slijeva nadesno.</p>

<p>Kada putnik kupi avionsku kartu, sofisticirani mu algoritam dodijeli sjedalo prema sljedećim pravilima:</p>

<ol>
	<li>
	<p>Ako postoji prazno sjedalo u redu koji se nalazi direktno iza nekog izlaznog reda, svi se ostali redovi (za koje ne vrijedi ovo svojstvo) ignoriraju u idućem pravilu.</p>
	</li>
	<li>
	<p>Najprije se odabire red s najvećim brojem praznih sjedala. Ako postoji vi&scaron;e takvih redova, odabire se onaj red koji je najbliži nekom izlaznom redu (udaljenost između redova $a$ i $b$ je $|a &minus; b|$). Ako i dalje postoji vi&scaron;e takvih redova, odabire se onaj s najmanjim brojem.</p>
	</li>
	<li>
	<p>Potom se u obzir uzmu sva prazna sjedala u odabranom redu, te se odabire ono koje ima <em>najveći prioritet</em>. Poredak sjedala prema prioritetu (od najvećeg do najmanjeg) jest:</p>

	<ol style="list-style-type: lower-alpha;">
		<li>Sjedala uz prolaz srednje grupe (<code>D</code> i <code>F</code>)</li>
		<li>Sjedala uz prolaz prve i treće grupe (<code>C</code> i <code>G</code>)</li>
		<li>Sjedala uz prozor (<code>A</code> i <code>I</code>)</li>
		<li>Srednje sjedalo srednje grupe (<code>E</code>)</li>
		<li>Preostala srednja sjedala (<code>B</code> i <code>H</code>)</li>
	</ol>

	<p>Ako postoje dva prazna sjedala s istim najvećim prioritetom, tada je potrebno uzeti u obzir balans cijelog zrakoplova. Putnici s <em>lijeve strane</em> zrakoplova sjede na sjedalima s oznakama <code>A</code>, <code>B</code>, <code>C</code> i <code>D</code>, dok putnici s desne strane zrakoplova sjede na sjedalima s oznakama <code>F</code>, <code>G</code>, <code>H</code> i <code>I</code>. Algoritam odabire sjedalo koje se nalazi na strani zrakoplova s vi&scaron;e praznih sjedala. Ako obje strane zrakoplova sadrže jednak broj praznih sjedala, algoritam odabire sjedalo s lijeve strane zrakoplova.</p>
	</li>
</ol>

<p>Neka su sjedala u zrakoplovu unaprijed rezervirana (ne nužno koristeći opisani algoritam), a va&scaron; je zadatak dodijeliti dodijeliti sjedala za sljedećih $n$ putnika prema opisanom algoritmu.</p>

### 입력

<p>U prvom su retku prirodni brojevi $r$ i $n$ ($2 &le; r &le; 50$, $1 &le; n &le; 26$) iz teksta zadatka.</p>

<p>Idućih $r + 3$ redaka predstavlja trenutno stanje sjedala u zrakoplovu. Preciznije, $j$-ti se redak sastoji od točno $11$ znakova koji predstavljaju stanje $j$-tog reda u zrakoplovu. Izlazni redovi i prolazi za putnike označeni su znakovima &#39;<code>.</code>&#39;, znak &#39;<code>#</code>&#39; označava rezervirano sjedalo, dok znak &#39;<code>-</code>&#39; označava prazno sjedalo.</p>

<p>Možete pretpostaviti da se u zrakoplovu nalazi barem n praznih sjedala.</p>

### 출력

<p>Potrebno je ispisati $r + 3$ redaka koji predstavljaju stanje sjedala u zrakoplovu nakon dodjele sjedala idućih $n$ putnika. Izlazni format mora biti jednak ulaznom uz dodatno svojstvo da je sjedalo koje je dodijeljeno $j$-tom putniku označeno $j$-tim malim slovom engleske abecede.</p>