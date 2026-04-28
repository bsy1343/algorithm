# [Gold II] Putevi - 25467

[문제 링크](https://www.acmicpc.net/problem/25467)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 10, 정답 비율: 76.923%

### 분류

수학, 다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Zadano je stablo od $N$ čvorova označenim prirodnim brojevima od $1$ do $N$. Čvor $2$ povezan je sa čvorom $1$, čvor $3$ s čvorom $1$, čvor $4$ s jednim od dva svoja djelitelja manja od sebe $1$ i $2$, čvor $5$ sa čvorom $1$, čvor $6$ s jednim od svoja $3$ djelitelja manja od sebe $1$, $2$ i $3$, itd.</p>

<p>Tvoj zadatak je za svaku duljinu puta od $1$ do $N$, odrediti koliko postoji puteva te duljine.</p>

### 입력

<p>U prvom je retku prirodan broj $N$ ($1 &le; N &le; 100\,000$), broj iz teksta zadatka.</p>

<p>U drugom retku je $N - 1$ prirodnih brojeva $P_i$ ($1 &le; P_i &lt; N$), redom oznake čvorova s kojim su čvorovi $2$, $3$, $4$, $\dots$, $N$ spojeni. Kao &scaron;to je već rečeno, one moraju biti strogo manji djelitelji oznaka čvorova s kojim se spajaju.</p>

### 출력

<p>U jednom retku ispi&scaron;i $N$ brojeva, za svaku duljinu puta od $1$ do $N$ redom broj puteva te duljine.</p>

### 힌트

<p>Opis trećeg probnog primjera:</p>

<p><img alt="" src="https://upload.acmicpc.net/417455e4-f1fa-4483-8219-f555fd5b5c4a/-/preview/" style="width: 168px; height: 164px; float: right;" />Na slici desno prikazano je stablo iz primjera.</p>

<p>U tom stablo je $6$ puteva duljine $1$, to su putevi u kojima je samo jedan čvor.</p>

<p>Putevi duljine dva: $(1, 2)$, $(1, 3)$, $(2, 4)$, $(1, 5)$ i $(3, 6)$.</p>

<p>Putevi duljine tri: $(1, 2, 4)$, $(1, 3, 6)$, $(2, 1, 3)$, $(2, 1, 5)$ i $(3, 1, 5)$.</p>

<p>Putevi duljine četiri: $(2, 1, 3, 6)$, $(4, 2, 1, 3)$, $(4, 2, 1, 5)$ i $(5, 1, 3, 6)$.</p>

<p>Jedini put duljine pet: $(4, 2, 1, 3, 6)$.</p>

<p>Nema puteva duljine $6$.</p>