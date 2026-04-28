# [Platinum I] CERN - 31981

[문제 링크](https://www.acmicpc.net/problem/31981)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 247, 정답: 41, 맞힌 사람: 27, 정답 비율: 14.754%

### 분류

mo's, 오프라인 쿼리

### 문제 설명

<p>CERN je međunarodna institucija fokusirana na nuklearna istraživanja i fiziku elementarnih čestica. Sustav akceleratora čestica u CERN-u koristi se za provođenje eksperimenata koji uključuju sudaranje čestica pri velikim brzinama.</p>

<p>Promatramo $N$ čestica poredanih u niz. Svaka čestica određena je svojom <em>vrstom</em> $v_i$, &scaron;to predstavljamo prirodnim brojem između $1$ i $N$.</p>

<p>U najnovijem istraživanju potrebno je provesti $Q$ eksperimenata. U $i$-tom eksperimentu promatramo sve čestice od $l_i$-te do $r_i$-te u nizu ($l_i &lt; r_i$). Među promatranim česticama možemo odabrati bilo koje dvije čestice različite vrste te ih sudariti u akceleratoru, čime obje čestice bivaju uni&scaron;tene. Navedeni postupak sudaranja ponavljamo dok god među promatranim česticama postoje dvije čestice različite vrste. Eksperiment zavr&scaron;ava ili time &scaron;to su sve promatrane čestice uni&scaron;tene, ili je preostao neki broj čestica iste vrste. Naravno, ovisno o tome kojim redoslijedom i koje čestice sudaramo, moguće je na kraju zavr&scaron;iti s raznim vrstama čestica.</p>

<p>Budući da sudaranje čestica nije jeftino, odlučili ste da ćete eksperimente provoditi samo u teoriji. Sada vas za svaki eksperiment zanima koliko postoji vrsta čestica tako da je moguće eksperiment zavr&scaron;iti s nekim brojem preostalih čestica te vrste.</p>

### 입력

<p>U prvom su retku prirodni brojevi $N$ i $Q$, redom broj čestica i broj eksperimenata.</p>

<p>U sljedećem je retku niz od $N$ brojeva $v_1, \dots, v_N$, redom vrste čestica.</p>

<p>U i-tom od sljedećih $Q$ redaka je par od dva prirodna broja $l_i$ i $r_i$ ($1 &le; l_i &lt; r_i &le; N$) koji predstavljaju promatrani interval čestica u $i$-tom eksperimentu.</p>

### 출력

<p>Za svaki od $Q$ eksperimenata u zasebni redak ispi&scaron;ite traženi broj vrsta čestica s kojima je moguće zavr&scaron;iti eksperiment.</p>

### 제한

<p>U svim podzadacima vrijedi $2 &le; N &le; 500\, 000$ i $1 &le; Q &le; 500\, 000$.</p>

### 힌트

<p>Poja&scaron;njenje probnog primjera:</p>

<p>U prvom eksperimentu možemo sudariti čestice vrsta $3$ i $4$, čime preostaju dvije čestice vrste $2$. Ne postoji način da na kraju preostane neka druga vrsta čestica.</p>

<p>U drugom eksperimentu moguće je za svaku vrstu čestica postići da na kraju preostani neki broj čestica te vrste.</p>

<p>U četvrtom i petom eksperimentu će neovisno o odabiru sudara na kraju preostati neki broj čestica vrste $4$.</p>