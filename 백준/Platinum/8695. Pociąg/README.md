# [Platinum V] Pociąg - 8695

[문제 링크](https://www.acmicpc.net/problem/8695)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 3, 맞힌 사람: 3, 정답 비율: 27.273%

### 분류

자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵, 해싱

### 문제 설명

<p>Mały Jacuś dostał od mamy pociąg złożony z <em>n</em>&nbsp;wagon&oacute;w. Po dokładnym obejrzeniu każdego z nich stwierdził, że na odwrocie wagon&oacute;w znajduje się numer seryjny złożony z małych liter alfabetu angielskiego.</p>

<p>Mały Jacuś może układać wagony w dowolnej kolejności, budując w ten spos&oacute;b pociąg (zawsze z <em>n</em>&nbsp;wagon&oacute;w), kt&oacute;ry po odwr&oacute;ceniu tworzy pewien tekst <em>w</em>. Znudziło mu się to dość szybko, ponieważ chciał zająć się informatyką. W związku z tym wymyślił zadanie.</p>

<p>Poprosił mamusię, aby napisała na kartce pewien tekst <em>t</em>. Tekst <em>w</em>&nbsp;uznał za wzorzec, kt&oacute;rego będzie szukał w tekście&nbsp;<em>t</em>. Jacuś chce policzyć sumę wystąpień wszystkich wzorc&oacute;w (zbudowanych z każdej permutacji pociągu) w tekście <em>t</em>.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &lt; 10). W&nbsp;<em>n</em>&nbsp;kolejnych wierszach znajduje się tekst <em>w<sub>i</sub></em>&nbsp;oznaczający numer seryjny <em>i</em>&nbsp;- tego wagonu (długość numeru seryjnego nie przekracza 10<sup>5</sup>). W kolejnym wierszu znajduje się tekst <em>t</em>&nbsp;(długość tekstu <em>t</em>&nbsp;nie przekracza 10<sup>6</sup>).</p>

### 출력

<p>W jedynym wierszu wyjścia powinna znaleźć się jedna liczba całkowita, r&oacute;wna sumie wystąpień wszystkich wzorc&oacute;w.</p>