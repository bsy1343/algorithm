# [Silver I] Žetva - 14145

[문제 링크](https://www.acmicpc.net/problem/14145)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 117, 정답: 88, 맞힌 사람: 74, 정답 비율: 78.723%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 플러드 필

### 문제 설명

<p>Zoran živi na farmi te ima najveći kombajn u selu. Ove je godine, unatoč problemima s otkupom, Zoran posadio nekoliko polja p&scaron;enice. Do&scaron;lo je vrijeme žetve, a njemu se sad ba&scaron; i ne da raditi.</p>

<p>Ipak, svaki će dan požnjat jedno polje p&scaron;enice i to ono najmanje kvadrature.</p>

<p>Njegovo zemlji&scaron;te možemo predstaviti R&times;S kvadratnom mrežom. Za svaki kvadrat poznato je da li je Zoran tamo posijao p&scaron;enicu ili nije. Za dva kvadrata zemlji&scaron;ta kažemo da su susjedni ako imaju zajedničku stranicu.</p>

<p>Jednim poljem p&scaron;enice nazivamo maksimalan skup susjednih kvadrata na kojima je posijana p&scaron;enica. U lijevoj tablici prepoznajemo tako četiri polja. U desnoj tablici polja su označena redom kojim će ih Zoran žnjeti.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14145.%E2%80%85%C5%BDetva/df42810a.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14145/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%203.00.16.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:90px; width:302px" /></p>

<p>Napi&scaron;ite program koji će za svaki kvadrat na kojem je posijana p&scaron;enica odrediti na koji će dan Zoran proći svojim kombajnom i požnjeti p&scaron;enicu.&nbsp;</p>

### 입력

<p>U prvom retku nalaze se prirodni brojevi R i S (1 &le; R, S &le; 50), dimenzije Zoranovog zemlji&scaron;ta.</p>

<p>U sljedećih R redaka nalazi se po S znakova &#39;0&#39; ili &#39;1&#39;. Znak &#39;0&#39; predstavlja kvadrat zemlji&scaron;ta na kojem nije posijana p&scaron;enica, a znak &#39;1&#39; kvadrat zemlji&scaron;ta na kojem je posijana p&scaron;enica.</p>

<p>Broj polja p&scaron;enice bit će manji od 10, a nijedna dva polja p&scaron;enice neće imati jednaku kvadraturu.&nbsp;</p>

### 출력

<p>U R redaka potrebno je ispisati po S znakova. Na kvadratima koji ne sadrže p&scaron;enicu mora stajati znak &#39;0&#39;, dok na preostalim kvadratima mora stajati redni broj dana kad će taj kvadrat biti požnjen.&nbsp;</p>