# [Platinum III] Izviðači - 14139

[문제 링크](https://www.acmicpc.net/problem/14139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

자료 구조, 오일러 경로 테크닉, 최소 공통 조상, 세그먼트 트리, 트리

### 문제 설명

<p>Dru&scaron;tvo izvi&ntilde;ača Hrvatske ima podružnice u N gradova diljem zemlje povezanih s N&minus;1 željezničkom prugom. Gradovi su povezani na način da se iz svakog grada može doći do svakog drugog i to na jedinstven način, odnosno gradovi zajedno sa prugama čine stablo.</p>

<p>Kažemo da su gradovi susjedni ako postoji željeznička pruga koja direktno spaja dva grada. Država daje poticaj za izvi&ntilde;ače, pa cijena putovanja vlakom za jednog izvi&ntilde;ača iznosi samo jednu kunu po pre&ntilde;enoj trasi pruge izme&ntilde;u dva susjedna grada.</p>

<p>Jedini zadaci kojima se Dru&scaron;tvo kroz godinu bavi su:</p>

<ul>
	<li>Prijava novog člana u nekom gradu.</li>
	<li>Organizacija izvi&ntilde;ačkog skupa u nekom gradu.</li>
</ul>

<p>Na izvi&ntilde;ački skup putuju vlakom svi članovi Dru&scaron;tva i to na tro&scaron;ak Dru&scaron;tva. Prvi izvi&ntilde;ački skup u godini uvijek se održava u gradu s oznakom 1. Svaki slijedeći skup održava se u jednom od gradova susjeda prethodnom domaćinu.</p>

<p>Poznat je broj članova Dru&scaron;tva u svakom od gradova na početku godine, te prijave novih članova, odnosno izvi&ntilde;ački skupovi redom kojim su se doga&ntilde;ali.</p>

<p>Napi&scaron;ite program koji će za svaki održani skup odrediti ukupnu količinu novca potro&scaron;enog na putne tro&scaron;kove.&nbsp;</p>

### 입력

<p>U prvom retku nalazi se prirodni broj N (1 &le; N &le; 100000), broj gradova.</p>

<p>U drugom retku nalazi se N nenegativnih cijelih brojeva manjih od 1000, broj članova u svakom od gradova na početku godine.</p>

<p>U sljedećih N&minus;1 redaka nalaze se opisi željezničkih pruga. Opis pruge sastoji se od dva prirodna broja A i B (1 &le; A &le; N, 1 &le; B &le; N). To znači da postoji pruga koja povezuje gradove s oznakama A i B.</p>

<p>U sljedećem retku nalazi se prirodni broj M (1 &le; M &le; 300000), broj zadataka.</p>

<p>U sljedećih M redaka nalaze se opisi zadataka redom kojim se moraju obaviti. Opis zadatka sastoji se od znaka &#39;P&#39; ili &#39;S&#39; i prirodnog broja G (1 &le; G &le; N).</p>

<p>Znak &#39;P&#39; predstavlja prijavu novog člana u gradu G, a znak &#39;S&#39; izvi&ntilde;ački skup u gradu G.</p>

<p>Prvi zadatak uvijek će se odnositi na izvi&ntilde;ački skup u gradu 1, dok će svaki slijedeći skup biti održan u gradu susjednom prethodnom domaćinu skupa.&nbsp;</p>

### 출력

<p>Za svaki &#39;S&#39; zadatak potrebno je ispisati po jedan cijeli broj, količinu novca potro&scaron;enog na putne tro&scaron;kove organizacije tog skupa.</p>

<p>Napomena: Koristite 64-bitni cjelobrojni tip podataka.&nbsp;</p>