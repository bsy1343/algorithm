# [Platinum I] Škola - 14143

[문제 링크](https://www.acmicpc.net/problem/14143)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 15, 맞힌 사람: 7, 정답 비율: 38.889%

### 분류

자료 구조, 퍼시스턴트 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>Mali Luka svaki dan pje&scaron;ači u &scaron;kolu, uvijek istim putem i to tako da:</p>

<ul>
	<li>najprije pre&ntilde;e točno četvrtinu puta hodajući ravno prema istoku,</li>
	<li>zatim pre&ntilde;e polovinu ukupnog puta hodajući ravno prema jugu,</li>
	<li>te pre&ntilde;e preostalu četvrtinu puta hodajući ponovno ravno prema istoku.</li>
</ul>

<p>Lukino selo predstavljeno je pravilnom N&times;N kvadratnom mrežom. Neki kvadrati prepuni su bodljikavog grmlja, pa su potpuno neprohodni, dok je na preostalim kvadratima fina travnata povr&scaron;ina, po kojoj Luka može slobodno gaziti. Na ilustracijama dolje, sivi su kvadrati neprohodni, dok su bijeli prohodni.</p>

<p>Luka, na svojem putu, nikada ne hoda po rubu izme&ntilde;u dva kvadrata.</p>

<p>U centru jednog, nama nepoznatog, travnatog kvadrata nalazi se Lukina kuća, dok se u centru jednog drugog, tako&ntilde;er nepoznatog, travnatog kvadrata nalazi &scaron;kola.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14143.%E2%80%85%C5%A0kola/072e8f8d.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14143/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%202.56.56.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:153px; width:540px" /><br />
Ilustracije prikazuju rje&scaron;enje prvog primjera. Postoji ukupno tri moguća para pozicija Lukine kuće i &scaron;kole.</p>

<p>Napi&scaron;ite program koji će za zadanu kvadratnu mrežu odrediti ukupan broj parova pozicija na kojima se mogu nalaziti Lukina kuća i &scaron;kola.&nbsp;</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N (1 &le; N &le; 2000), dimenzije kvadratne mreže.</p>

<p>U svakom od sljedećih N redaka nalazi se po N znakova: &#39;.&#39; (točka) ili malo slovo &#39;x&#39;. Točkom su predstavljeni travnati kvadrati, dok su malim slovom &#39;x&#39; predstavljeni neprohodni kvadrati.</p>

<p>Kvadratna mreža poklapa se sa zemljinim osima i to tako da su kvadrati u prvom retku najsjeverniji, a kvadrati u prvom stupcu najzapadniji.&nbsp;</p>

### 출력

<p>U prvi redak potrebno je ispisati ukupan broj parova pozicija na kojima se mogu nalaziti Lukina kuća i &scaron;kola.&nbsp;</p>