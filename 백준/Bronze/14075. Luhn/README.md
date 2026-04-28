# [Bronze III] Luhn - 14075

[문제 링크](https://www.acmicpc.net/problem/14075)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 350, 정답: 265, 맞힌 사람: 242, 정답 비율: 75.862%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Većina bankovnih kartica ima &scaron;esnaesteroznamenkasti broj koji zovemo broj kartice. Međutim, nije bilo koji broj ispravan broj kartice - taj broj mora zadovoljavati Luhnov algoritam. Luhnov algoritam funkcionira na slijedeći način:</p>

<ol>
	<li>Počev&scaron;i od zadnje znamenke, svaka druga znamenka se udvostruči.</li>
	<li>Ako je rezultat udvostručenja znamenke veći ili jednak 10, dobivenom umno&scaron;ku se zbroje znamenke da se dobije jednoznamenkasti broj.</li>
	<li>Svi brojevi se zbroje.</li>
	<li>Dobiveni zbroj mora biti dijeljiv s 10.</li>
</ol>

<p>Na primjer, ako je broj kartice 1234567890123452, udvostručenjem svake druge znamenke dobili bismo:&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/14075.%E2%80%85Luhn/7d960c7e.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14075/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-02%20%EC%98%A4%ED%9B%84%203.37.04.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:89px; width:613px" /></p>

<p>Kada svakom broju većem ili jednakom 10 zbroje znamenke, dobijemo:&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/14075.%E2%80%85Luhn/74926ef7.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14075/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-02%20%EC%98%A4%ED%9B%84%203.37.15.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:88px; width:613px" /></p>

<p>Kada se tako dobiveni brojevi zbroje, ukupan rezultat je 60, &scaron;to je djeljivo s 10 pa je i kartica valjana.</p>

<p>Va&scaron; zadatak je provjeriti je li dana kartica valjana.&nbsp;</p>

### 입력

<p>U prvom i jedinom retku ulaznih podataka nalazi se jedan cijeli broj: &scaron;enaesteroznamenkasti broj koji označava broj kartice.&nbsp;</p>

### 출력

<p>Potrebno je ispisati &quot;DA&quot; ako je dani broj valjani broj kartice, odnosno &quot;NE&quot; ako to nije.&nbsp;</p>