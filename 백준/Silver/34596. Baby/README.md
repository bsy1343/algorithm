# [Silver II] Baby - 34596

[문제 링크](https://www.acmicpc.net/problem/34596)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 11, 맞힌 사람: 10, 정답 비율: 55.556%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Vjerojatno se sjećaš zadatka Sudoku s JHIO-a 2024. Međutim, to je bio <em>baby</em> zadatak. Pravi zadatak se zapravo sakrio unutar tog zadataka, a to je generiranje testnih primjera za njega.</p>

<p>Jedan dio generiranja testnih primjera za zadatak Sudoku je bio generirati <strong>ispravne</strong> sudoku tablice.</p>

<p>Podsjetimo se, za tablicu kažemo da je <strong>ispravna</strong> ako se u svakom retku, stupcu i posebnom kvadratu svaki od brojeva nalazi točno jednom i niti jedno polje tablice nije prazno, tj. u svako je upisan neki broj.</p>

<p>Posebne kvadrate definiramo na sljedeći način - prvi posebni kvadrat čine polja iz presjeka prvih $N$ redaka i prvih $N$ stupaca. Drugi posebni kvadrat čine polja iz presjeka prvih $N$ redaka i drugih $N$ stupaca. Treći posebni kvadrat čine polja iz presjeka prvih $N$ redaka i trećih $N$ stupaca, i tako dalje.</p>

<p>U ovom zadatku zadat ćemo ti broj $N$, a ti trebaš ispisati <strong>tri</strong> različite ispravne sudoku tablice s $N \times N$ redaka i $N \times N$ stupaca. Brojevi u tablici trebaju biti između $1$ i $N \times N$. Za kraj, autor zadatka Sudoku ima još samo jednu želju. On želi da u prvom retku u $X$-tom stupcu bude broj $X$.</p>

### 입력

<p>U prvom je retku prirodan broj $N$ ($3 ≤ N ≤ 30$), broj iz teksta zadatka.</p>

### 출력

<p>U $3 \times N \times N$ redaka ispiši tri tražene tablice iz zadatka.</p>

### 힌트

<p>Opis jedinog probnog primjera: Prazne linije između tablica su dodane zbog čitljivosti, ti ih <strong>ne trebaš</strong> ispisati. Prva tablica iz ispisa:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34596.%E2%80%85Baby/23ca947e.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34596-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 231px; height: 233px;"></p>