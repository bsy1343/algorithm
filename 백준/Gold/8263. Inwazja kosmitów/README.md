# [Gold IV] Inwazja kosmitów - 8263

[문제 링크](https://www.acmicpc.net/problem/8263)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 8, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>W Bajtockim Instytucie Egzobiologii powołano właśnie do życia Zakład Ostrzegania przed Niebezpieczeństwami z Kosmosu. Zatrudnieni w nim naukowcy mają za zadanie zrobić wszystko, aby uchronić obywateli Bajtocji przed skutkami inwazji kosmit&oacute;w, kt&oacute;ra niechybnie nastąpi.</p>

<p>W Bajtocji znajduje się&nbsp;<em>n</em>&nbsp;miast, położonych wzdłuż Bajtodrogi. Miasta będziemy numerować kolejno od 1 do <em>n</em>. W mieście o numerze <em>i</em>&nbsp;mieszka <em>a<sub>i</sub></em>&nbsp;obywateli.</p>

<p>Jak powszechnie wiadomo, kosmici zawsze atakują nocą, co najwyżej jedno miasto. Niestety, ich atak jest natychmiastowy - wszyscy mieszkańcy zaatakowanego miasta zostają błyskawicznie porwani i wytransportowani do galaktyki kosmit&oacute;w.</p>

<p>Naukowcy w zakładzie pracują nad sposobem ochrony mieszkańc&oacute;w. Ponieważ kosmit&oacute;w nie interesują bajtockie gryzonie, naukowcy postanowili wykorzystać tresowane szczury do ostrzeżenia pozostałych miast w Bajtocji. Gdy kosmici zaatakują jakieś miasto, dwa szczury wyruszą z tego miasta w przeciwnych kierunkach Bajtodrogi, niosąc wiadomość o napaści. Przebiegnięcie jednego odcinka Bajtodrogi zajmuje im prawie cały dzień, wobec tego wiadomość wysłana z miasta <em>j</em>&nbsp;dotrze do miasta <em>k</em>&nbsp;tuż przed zapadnięciem zmroku |<em>k</em> - <em>j</em>|-tego dnia po ataku. Zaalarmowani mieszkańcy chowają się do schron&oacute;w, gdzie macki kosmit&oacute;w ich nie dosięgną. Ponieważ bajtockie schrony są dobrze zaopatrzone, ostrzeżeni mieszkańcy pozostaną w nich tak długo, aż kosmici zaprzestaną atak&oacute;w i wr&oacute;cą do swojej galaktyki.</p>

<p>Jak widać, opisany system niekoniecznie pozwoli uratować się wszystkim obywatelom Bajtocji. Naukowcy zastanawiają się, ilu mieszkańc&oacute;w zostanie porwanych w najgorszym przypadku.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1 000 000), oznaczająca liczbę miast w Bajtocji. W drugim wierszu znajduje się ciąg liczb całkowitych <em>a</em><sub>1</sub>, ..., <em>a<sub>n</sub></em>&nbsp;(0 &le; <em>a<sub>i</sub></em> &le; 10<sup>9</sup>). Określają one liczby mieszkańc&oacute;w kolejnych miast położonych wzdłuż Bajtodrogi.</p>

### 출력

<p>W jedynym wierszu wyjścia należy wypisać liczbę całkowitą oznaczającą maksymalną możliwą liczbę porwanych mieszkańc&oacute;w.</p>