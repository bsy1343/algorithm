# [Silver V] Definite Values - 6325

[문제 링크](https://www.acmicpc.net/problem/6325)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 241, 정답: 139, 맞힌 사람: 123, 정답 비율: 55.909%

### 분류

구현, 자료 구조, 트리를 사용한 집합과 맵

### 문제 설명

<p>A common error in programming is to use variables that have not been initialized before. For example, in C and C++, all variables have an indefinite value after declaration &ndash; their value can be anything. Thus, the following program</p>

<pre class="brush:c; toolbar:false;">
main()
{
    int x;
    printf(&quot;%d\n&quot;,x);
}
</pre>

<p>could print any number. But even in languages such as Pascal, where all values are initialized to zero, it is useful to give variables definite values before using them, to avoid side effects when your code portion is placed into a different context.</p>

<p>Generally, the problem of deciding for a given program whether all variables have been assigned values before they are read out, is undecidable. But if you, as in this problem, consider only a sequence of assignments, the problem becomes solvable.</p>

### 입력

<p>The input file contains several program parts. Each part starts with a number n on a line by itself, the number of lines in the program part. The following n lines contain each an assignment of the form &ldquo;variable1 = variable2&rdquo;, where the variablei&rsquo;s are lower-case letters.</p>

<p>The input is terminated by a test case starting with n = 0.</p>

### 출력

<p>Assume that before the execution of the given program part, variable a has some definite value, while all other variables are undefined. You have to print the names of the variables which have a definite value after the execution of the program part. More specifically, format your output as follows.</p>

<p>For each program part in the input, first print the number of the program, as shown in the sample output. Then print a line containing the names of the variables which have a definite value after the execution of the given program part. Print them in alphabetically sorted order, and leave one blank after each variable name. If none of the variables has a definite value after the execution of the program part, print the word &ldquo;none&rdquo;.</p>

<p>Print a blank line after each test case.</p>