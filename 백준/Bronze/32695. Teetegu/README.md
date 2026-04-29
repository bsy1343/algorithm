# [Bronze I] Teetegu - 32695

[문제 링크](https://www.acmicpc.net/problem/32695)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 33, 맞힌 사람: 21, 정답 비율: 91.304%

### 분류

사칙연산, 수학

### 문제 설명

<p>Oled teed tegemas ja kuumutasid just kannutäie vett $100$ kraadini. Tead juba, et soovid täpselt tunni aja pärast uuesti teed teha ja selleks on jälle vaja $100$-kraadist vett.</p>

<p>Sul on nutikas teekann, mis oskab lisaks vee kuumutamisele seda ka soojas hoida. Kui vett soojas ei hoita, siis hakkab kannu jäänud vesi jahtuma, kuni jõuab toatemperatuurile, mis sinu toas on $22$ kraadi, ja püsib seejärel toatemperatuuril, kuni seda uuesti kuumutama hakatakse. Aga ka vee soojas hoidmine kulutab energiat.</p>

<p>Kirjutada programm, mis selgitab välja, kui suur oleks energiakulu siis, kui vett soojas hoida, ja kui suur siis, kui lasta veel jahtuda ja seda siis uuesti kuumutada.</p>

### 입력

<p>Sisendi ainsal real on neli tühikutega eraldatud reaalarvu: $A$, $B$, $C$ ja $D$.</p>

<ul>
	<li>$A$ ($0 &lt; A \le 100$) näitab, mitu kJ energiat kulub kannus oleva vee kuumutamiseks ühe kraadi võrra.</li>
	<li>$B$ ($0 &lt; B \le 3\,600$) näitab, mitu sekundit võtab kannus oleva vee kuumutamine ühe kraadi võrra.</li>
	<li>$C$ ($0 &lt; C \le 100$) näitab, mitu kJ energiat kulub kannus oleva vee soojas hoidmiseks ühe minuti jooksul. Seda võib vee kuumutamise ajal ignoreerida.</li>
	<li>$D$ ($0 &lt; D \le 100$) näitab, mitme kraadi võrra jahtub kannus olev vesi iga minutiga, kui seda soojas ei hoita. Seda võib vee kuumutamise ajal ignoreerida.</li>
</ul>

### 출력

<p>Väljastada kaks rida.</p>

<p>Esimesele reale väljastada üks arv: mitu kJ kuluks energiat, kui vett järgmise teevalmistamiseni soojas hoida. Väljastatud vastus ei tohi õigest erineda rohkem kui $0,01$ võrra.</p>

<p>Teisele reale väljastada samuti üks arv: mitu kJ kuluks energiat, kui vett soojas mitte hoida, vaid lasta sel jahtuda ja see järgmise teevalmistamise ajaks uuesti $100$ kraadini kuumutada. Väljastatud vastus ei tohi õigest erineda rohkem kui $0,01$ võrra.</p>