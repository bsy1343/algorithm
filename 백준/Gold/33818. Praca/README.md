# [Gold IV] Praca - 33818

[문제 링크](https://www.acmicpc.net/problem/33818)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

누적 합, 브루트포스 알고리즘

### 문제 설명

<p>Potyczki Algorytmiczne wystartowały! Niestety, Bajtazar nie może zaniedbywać swojej pracy, a jego obowiązki magicznie nie znikają na czas potyczkowego tygodnia. Dzień Bajtazara możemy przedstawić jako $n$ segmentów, każdy trwający jedną bajtogodzinę. Obowiązki podczas każdego z tych segmentów należą do jednej z trzech kategorii:</p>

<ol>
	<li>spotkanie w biurze,</li>
	<li>zdalne spotkanie,</li>
	<li>brak obowiązków.</li>
</ol>

<p>W ciągu dnia Bajtazar może być w domu, w biurze lub w drodze między nimi. Bajtazar zaczyna i kończy swój dzień w domu. Może pojechać do biura <strong>co najwyżej raz</strong>, o ile zdąży wrócić do domu przed upływem $n$-tej bajtogodziny. Przejazdy z domu do biura i z biura do domu trwają dokładnie po $t$ bajtogodzin. W zależności od swojej lokalizacji Bajtazar może podejmować różne działania:</p>

<ul>
	<li>W domu: Bajtazar oczywiście nie może uczestniczyć w spotkaniu w biurze, może (ale nie musi) uczestniczyć w zdalnym spotkaniu albo może rozwiązywać zadania z rund zdalnych Potyczek Algorytmicznych (ale nie może rozwiązywać zadań, uczestnicząc w spotkaniu).</li>
	<li>W drodze: Bajtazar nie może uczestniczyć w żadnym spotkaniu, ani nie może rozwiązywać zadań – musi się skupić na prowadzeniu samochodu (nie stać go na szofera).</li>
	<li>W biurze: Bajtazar może uczestniczyć w spotkaniu dowolnego typu, a poza spotkaniami musi pracować – nie może wtedy rozwiązywać zadań.</li>
</ul>

<p>Twoim zadaniem jest zaplanować dzień Bajtazara tak, aby zmaksymalizować liczbę bajtogodzin, podczas których będzie rozwiązywał zadania. Jednakże, jeśli Bajtazar opuści więcej niż $k$ spotkań może zostać zwolniony z pracy. Wtedy jego start w przyszłorocznej edycji, jak wiele innych życiowych spraw, stanęłoby pod znakiem zapytania – nie chcemy tego.</p>

<p>Bajtazar jest bardzo dobrze zorganizowany, więc w każdym z segmentów skupia się na dokładnie jednej czynności, w szczególności trasy pomiędzy domem i pracą zajmują mu dokładnie po $t$ całych kolejnych segmentów.</p>

### 입력

<p>W pierwszym wierszu znajdują się trzy liczby całkowite $n$, $k$ oraz $t$ ($3 ≤ n ≤ 8000$, $0 ≤ k ≤ n$, $1 ≤ t &lt; \frac{n}{2}$), oznaczające odpowiednio: liczbę segmentów, liczbę spotkań, które Bajtazar może opuścić, oraz czas trwania przejazdu w jedną stronę między domem Bajtazara a biurem (w bajtogodzinach).</p>

<p>W drugim wierszu znajduje się słowo długości $n$ złożone ze znaków <code>1</code>, <code>2</code> lub <code>3</code> oznaczające rodzaj obowiązków Bajtazara podczas kolejnych segmentów dnia. Znaki odpowiadają numerom kategorii podanych wyżej w treści.</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita oznaczająca liczbę bajtogodzin, które Bajtazar może spędzić na rozwiązywaniu zadań, nie opuszczając więcej niż $k$ spotkań. Jeśli jednak nie jest możliwe opuszczenie nie więcej niż $k$ spotkań, należy wypisać $-1$.</p>

### 힌트

<p>Wyjaśnienie przykładów: W pierwszym przykładzie w jednym z optymalnych rozwiązań Bajtazar spędza kolejne segmenty dnia w następujący sposób:</p>

<ol>
	<li>Rozwiązywanie zadań</li>
	<li>Zdalne spotkanie z domu</li>
	<li>Rozwiązywanie zadań</li>
	<li>Droga do pracy</li>
	<li>Droga do pracy</li>
	<li>Spotkanie w biurze</li>
	<li>Droga do domu</li>
	<li>Droga do domu (przegapia jedno spotkanie)</li>
	<li>Rozwiązywanie zadań</li>
	<li>Zdalne spotkanie z domu</li>
</ol>

<p>W tym planie Bajtazar opuszcza dokładnie jedno spotkanie i rozwiązuje zadania przez $3$ bajtogodziny.</p>

<p>W drugim przykładzie jedyny plan, w którym Bajtazar nie traci pracy wygląda następująco:</p>

<ol>
	<li>Droga do pracy</li>
	<li>Droga do pracy</li>
	<li>Spotkanie w biurze</li>
	<li>Praca w biurze</li>
	<li>Zdalne spotkanie z biura</li>
	<li>Droga do domu</li>
	<li>Droga do domu</li>
</ol>

<p>W trzecim przykładzie Bajtazar może spędzić cały dzień w domu, rozwiązując zadania i pomijając wszystkie zdalne spotkania.</p>

<p>W czwartym przykładzie Bajtazar nie jest w stanie uczestniczyć w spotkaniach w biurze, ponieważ nie jest w stanie na nie zdążyć lub zdążyć wrócić z nich do domu.</p>