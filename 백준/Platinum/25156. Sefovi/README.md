# [Platinum II] Sefovi - 25156

[문제 링크](https://www.acmicpc.net/problem/25156)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 1, 맞힌 사람: 1, 정답 비율: 9.091%

### 분류

그리디 알고리즘, 많은 조건 분기

### 문제 설명

<p>Nikola igra novu hit igru Ljudi i sefovi.</p>

<p>U igri sudjeluje N ljudi i N sefova, poredanih u krug naizmjenično, počev&scaron;i od prvog čovjeka, kao na slici.</p>

<p>Znamo da i-ti sef sadrži S<sub>i</sub> kuna, a da i-tom čovjeku treba C<sub>i</sub> kuna. Ako se neki sef otvori, iz njega novac mogu uzimati samo oni ljudi koji su mu susjedni u krugu. Moguće je da u sefu ostane vi&scaron;ka novaca.</p>

<p>Pomozi Nikoli i ispi&scaron;i koliki je najmanji broj sefova koje mora otvoriti kako bi svi ljudi dobili svoj novac. Ako nije moguće zadovoljiti potrebe svih ljudi, ispi&scaron;i -1.</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N (1 &le; N &le; 1000), broj ljudi i sefova.</p>

<p>U drugom retku nalazi se N prirodnih brojeva C<sub>i</sub> (0 &le; C<sub>i</sub> &le; 1 000 000 000), broj kuna koje ljudi trebaju, redom od prvog do posljednjeg.</p>

<p>U trećem retku nalazi se N prirodnih brojeva S<sub>i</sub> (1 &le; S<sub>i</sub> &le; 1 000 000 000), broj kuna u sefovima, redom od prvog do posljednjeg.</p>

### 출력

<p>U jedini redak treba ispisati traženi broj iz teksta zadatka.</p>

### 힌트

<p>Opis prvog primjera: Dovoljno je otvoriti 2., 3. i 5. sef. Iz drugog će sefa drugi čovjek uzeti 4 kune, a treći 2 kune, iz trećeg će sefa treći čovjek uzeti 1 kunu, a četvrti čovjek preostale 4 kune, dok će iz petog sefa prvi i peti čovjek uzeti po 3 kune.</p>