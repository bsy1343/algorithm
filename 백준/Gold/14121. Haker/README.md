# [Gold V] Haker - 14121

[문제 링크](https://www.acmicpc.net/problem/14121)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 68, 정답: 8, 맞힌 사람: 8, 정답 비율: 25.806%

### 분류

해 구성하기, 그리디 알고리즘, 파싱, 문자열

### 문제 설명

<p>Mirko se nedavno zaposlio kao haker. Prvi zadatak koji je dobio od &scaron;efa je napisati alat koji će automatizirati otkrivanje učestalih pogre&scaron;aka na web stranici svojeg ureda.</p>

<p>Naziv web stranice (URL) sadrži dva dijela: adresu i upit.&nbsp;</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:600px">
	<tbody>
		<tr>
			<td style="text-align: center;"><code>&nbsp;http://www.hsin.hr/stud/index.php</code></td>
			<td style="text-align: center;"><code>tim=1&amp;kategorija=pero laka&amp;f=14&nbsp;</code></td>
		</tr>
		<tr>
			<td style="text-align: center;"><code>Adresa</code></td>
			<td style="text-align: center;"><code>Upit&nbsp;</code></td>
		</tr>
	</tbody>
</table>

<p>Adresa je niz znakova koji započinje s &quot;http://&quot;, a ostatak se sastoji od malih i velikih slova engleske abecede, točke &#39;.&#39; i kose crte &#39;/&#39;. Adresa i upit odvojeni su upitnikom &#39;?&#39;. Upitnik se u nazivu web stranice pojavljuje točno jednom. Upit se sastoji od jednog ili vi&scaron;e parametra. Svaki parametar je uređeni par imena i vrijednosti odijeljen znakom jednakosti &#39;=&#39;. Ime parametra je uvijek niz malih slova engleske abecede. Vrijednost parametra je niz malih i velikih slova engleske abecede, znamenki i razmaka &#39; &#39; (ASCII 32). U jednom upitu može se pojaviti vi&scaron;e parametara odvojenih znakom &#39;&amp;&#39;. U jednom upitu ne smiju se pojaviti dva parametra istog imena.</p>

<p>Hakeri često poku&scaron;avaju promjenom vrijednosti parametara steći nedopu&scaron;ten pristup web stranici. Mirkov zadatak je iz zadanog niza URL-ova i učestalih zloćudnih vrijednosti parametara stvoriti novi niz URL-ova takav da je svaki poznati parametar barem jednom pozvan sa svakom zloćudnom vrijednosti. Kako bi olak&scaron;ao otkrivanje gre&scaron;ke, Mirko u jednom upitu smije koristiti najvi&scaron;e P parametara. Budući da svako dohvaćanje URL-a traje vi&scaron;e sekundi, vrlo je važno da ukupan broj URL-ova bude &scaron;to je moguće manji.&nbsp;</p>

### 입력

<p>U prvom retku nalaze se tri prirodna broja:</p>

<ul>
	<li>N (1 &le; N &le; 100), broj zadanih URL-ova,</li>
	<li>P (1 &le; P &le; 10), najveći broj parametara koje Mirko smije iskoristiti u jednom URL-u,</li>
	<li>Z (1 &le; Z &le; 30), broj učestalih zloćudnih vrijednosti.</li>
</ul>

<p>U sljedećih N redaka nalazi se N URL-ova. Svi URL-ovi imat će istu adresu. Svi URL-ovi će biti sintaksno ispravni prema tekstu zadatka. Svaki URL imat će najvi&scaron;e 250 znakova i barem jedan parametar.</p>

<p>U sljedećih Z redaka nalaze se učestale zloćudne vrijednosti, jedna po retku. Svaka zloćudna vrijednost će imati najvi&scaron;e 25 znakova. Zloćudne vrijednosti će biti ispravne vrijednosti parametara. Mogu počinjati i zavr&scaron;avati razmakom.&nbsp;</p>

### 출력

<p>Potrebno je ispisati niz URL-ova takav da svaki poznati parametar budem barem jednom pozvan sa svakom zloćudnom vrijednosti. U svakom retku potrebno je ispisati jedan URL. URL smije sadržavati samo poznate parametre i zloćudne vrijednosti.</p>

<p>Napomena: Ukoliko postoji vi&scaron;e rje&scaron;enja koja zadovoljavaju sve uvjete, ispi&scaron;ite bilo koje.&nbsp;</p>