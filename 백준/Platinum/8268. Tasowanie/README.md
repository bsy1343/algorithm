# [Platinum III] Tasowanie - 8268

[문제 링크](https://www.acmicpc.net/problem/8268)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

수학, 정수론, 순열 사이클 분할

### 문제 설명

<p>Bajtazar dał w prezencie swojemu synowi, Bajtkowi, talię kart. Talia składa się z <em>n</em>&nbsp;kart, ponumerowanych liczbami od 1 do&nbsp;<em>n</em>.</p>

<p>Bajtek bardzo ucieszył się z prezentu. Przez cały wiecz&oacute;r siedział w swoim pokoju i bawił się, tasując karty w talii. Doszedł przy tym do takiej wprawy, że za każdym razem wychodziło mu to tak samo, tzn. podczas tasowania karta z pozycji <em>k</em>&nbsp;(dla 1 &le; <em>k</em> &le; <em>n</em>) przechodziła zawsze na pozycję <em>a<sub>k</sub></em>&nbsp;(oczywiście 1 &le; <em>a<sub>k</sub></em> &le; <em>n</em>).</p>

<p>W pewnym momencie do pokoju Bajtka przyszedł tata i powiedział, że czas już spać. Bajtek uprosił tatę, aby pokazał mu jeszcze przed snem, jak powinno się tasować karty. W&oacute;wczas Bajtazar potasował karty tak, że karta z pozycji <em>k</em>&nbsp;znalazła się na pozycji <em>b<sub>k</sub></em>&nbsp;(zn&oacute;w 1 &le; <em>k</em>, <em>b<sub>k</sub></em> &le; <em>n</em>).</p>

<p>Bajtek patrzył z podziwem na to, z jaką wprawą jego tata tasuje karty. Sam też chciałby tak umieć! Niestety Bajtek jest jeszcze mały i nie umie tasować tak jak jego tata. Wpadł jednak na pomysł, że spr&oacute;buje kilka razy powt&oacute;rzyć sw&oacute;j spos&oacute;b tasowania, tak aby na końcu otrzymać taki układ, jak po tasowaniu taty.</p>

<p>Teraz chłopiec nie może zasnąć, bo zastanawia się, czy jest to w og&oacute;le możliwe. Pom&oacute;ż mu!</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(2 &le; <em>n</em> &le; 1 000 000). Drugi i trzeci wiersz zawierają opisy permutacji <em>a</em><sub>1</sub>, ..., <em>a<sub>n</sub></em>&nbsp;oraz <em>b</em><sub>1</sub>, ..., <em>b<sub>n</sub></em>, czyli ciągi&nbsp;<em>n</em>&nbsp;parami r&oacute;żnych liczb całkowitych z zakresu od 1 do&nbsp;<em>n</em>. Możesz założyć, że te dwie permutacje są r&oacute;żne.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedno słowo&nbsp;<code>TAK</code>&nbsp;lub&nbsp;<code>NIE</code>, w zależności od tego, czy istnieje takie <em>k</em> &gt; 1, że powtarzając&nbsp;<em>k</em>-krotnie tasowanie Bajtka, można uzyskać potasowanie Bajtazara.</p>