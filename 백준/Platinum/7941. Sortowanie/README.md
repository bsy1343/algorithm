# [Platinum IV] Sortowanie - 7941

[문제 링크](https://www.acmicpc.net/problem/7941)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 13, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

애드 혹, 자료 구조, 세그먼트 트리

### 문제 설명

<p>Programowanie Genetyczne jest metodą automatycznego konstruowania program&oacute;w komputerowych. Algorytm Programowania Genetycznego pr&oacute;buje znaleźć program, kt&oacute;ry dla pewnych danych wejściowych, daje pewien oczekiwany wynik. Programowanie Genetyczne jest metodą ewolucyjną. Oznacza to, że szukanie odpowiedniego programu odbywa przy użyciu sztucznej ewolucji, mechanizmu wzorowanego na ewolucji biologicznej.</p>

<p>Przy użyciu Programowania Genetycznego wyewoluowano algorytm sortowania liczb całkowitych przedstawiony na poniższym listingu w języku C oraz Pascal w postaci procedury sort(). Okazuje się, że algorytm ten jest poprawny i sortuje on liczby od największej do najmniejszej. W najbardziej wewnętrznej pętli procedury sort() używana jest pomocnicza procedura swap(). Czy potrafisz szybko policzyć, ile razy wykona się procedura swap() dla danej tablicy t?</p>

<pre>
void swap(int *a, int *b)
{
    int tmp = *a;
    *a = *b;
    *b = tmp;
}
void sort(int t[], int N)
{
    int i, j;
    for (i = 0; i &lt; N; ++i)
        for (j = 0; j &lt; N; ++j)
            if (t[i] &gt; t[j])
                swap(&amp;t[i], &amp;t[j]);
}
</pre>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna d (1 &le; d &le; 100), określająca liczbę test&oacute;w.</p>

<p>Pierwsza linia testu zawiera liczbę n (1 &le; n &le; 10<sup>5</sup>), oznaczającą rozmiar tablicy t. W drugiejlinii znajdują liczby z tablicy t (&minus;10<sup>9</sup> &le; t<sub>i</sub> &le; 10<sup>9</sup> , dla i = 1..n).</p>

### 출력

<p>Dla każdego testu wypisz w pojedynczej linii liczbę wywołań procedury swap().</p>