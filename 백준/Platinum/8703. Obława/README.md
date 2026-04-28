# [Platinum II] Obława - 8703

[문제 링크](https://www.acmicpc.net/problem/8703)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 3, 맞힌 사람: 3, 정답 비율: 10.714%

### 분류

애드 혹, 자료 구조, 누적 합, 우선순위 큐, 세그먼트 트리, 스위핑

### 문제 설명

<p>Fifolandia ponownie jest w stanie wojny z Wielką Barańską Gogolską Dżamahirijją Ludową. Ostała się już tylko ostatnia jednostka nieprzyjaciela, kt&oacute;ra ukryła się gdzieś w lesie. Kapral Fifuś jest odpowiedzialny za zorganizowanie obławy na oddział nieprzyjaciela.</p>

<p>W związku z tym Fifuś szybko znalazł mapę lasu o rozmiarze <em>n</em>&nbsp;&times; <em>n</em>, na kt&oacute;rej dla każdego jednostkowego kwadratu oznaczone jest, czy znajdują się na nim bagna, czy też nie. Na mapie pola, na kt&oacute;rych jest bagno, są oznaczone jako 0, natomiast pozostałe pole, na kt&oacute;rych nie ma bagien, są oznaczone jako 1. Oczywiście oddziały Fifusia nie mogą stacjonować na obszarze, na kt&oacute;rym znajduje się bagno. Ponadto w wojskowym prawie Fifolandii jest dokładnie określone, jak powinna wyglądać obława, a Fifuś musi przestrzegać tych zasad.</p>

<p>Zgodnie z wojskowym prawem Fifolandzkim otaczając przeciwnika, należy tak rozmieścić wojska, aby tworzyły obw&oacute;d kwadratu o boku co najmniej 2. Podobno takie rozmieszczenie gwarantuje, że wojskom przeciwnika nie uda się uciec. Na nieszczęście Fifuś nie ma najmniejszego pojęcia, gdzie mogą znajdować się wojska przeciwnika. Dlatego zanim Fifuś zdecyduje, w kt&oacute;rym miejscu rozpocząć obławę, zastanawia się, na ile sposob&oacute;w można to zrobić.</p>

<p>Zakładamy, że wojska Fifolandii nie będą miały problem&oacute;w z dotarciem w dowolne miejsce, kt&oacute;re nie jest bagnem - mogą do tego użyć np. helikopter&oacute;w.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 2 000), oznaczającą długość boku mapy. Następnie na wejściu pojawi się&nbsp;<em>n</em>&nbsp;wierszy. W <em>i</em>-tym wystąpi ciąg <em>n</em>&nbsp;cyfr <em>t</em><sub><em>i</em>,1</sub>, <em>t</em><sub><em>i</em>,2</sub>, ..., <em>t</em><sub><em>i</em>,<em>n</em></sub>&nbsp;- zera lub jedynki. Jeżeli <em>t</em><sub><em>i</em>,<em>j</em></sub> = 0, oznacza to, że na danym polu jest bagno, natomiast&nbsp;<em>t</em><sub><em>i</em>,<em>j</em></sub> = 1&nbsp;oznacza, że na danym polu nie ma bagna.</p>

### 출력

<p>Pierwszy wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną liczbie sposob&oacute;w, na kt&oacute;re Fifuś może rozmieścić wojska.</p>

### 힌트

<p>Fifuś może rozmieścić wojsko na obwodzie kwadrat&oacute;w, kt&oacute;rych wsp&oacute;łrzędne lewego g&oacute;rnego rogu to:</p>

<ul>
	<li>(3, 3), bok długości 4,</li>
	<li>(1, 3), bok długości 3,</li>
	<li>(3, 2), (3, 3), (5, 5), bok długości 2.</li>
</ul>