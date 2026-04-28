# [Platinum II] Stack Machine Programmer - 3420

[문제 링크](https://www.acmicpc.net/problem/3420)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 18, 맞힌 사람: 11, 정답 비율: 45.833%

### 분류

(분류 없음)

### 문제 설명

<p>Many ciphers can be computed much faster using various machines and automata. The trouble with such machines is that someone has to write programs for them. Just imagine, how easy it would be if we could write a program that would be able to write another programs. In this contest problem, we will (for a while) ignore the fact that such a &ldquo;universal program&rdquo; is not possible. And also another fact that most of us would lose our jobs if it existed.</p>

<p>Your task is to write a program that will automatically generate programs for the stack machine defined in problem <a href="http://www.acmicpc.net/problem/3425">3425</a>.</p>

### 입력

<p>The input contains several test cases. Each test case starts with an integer number N (1 &le; N &le; 5), specifying the number of inputs your program will process. The next N lines contain two integer numbers each, V<sub>i</sub> and R<sub>i</sub>. V<sub>i</sub> (0 &le; V<sub>i</sub> &le; 10) is the input value and R<sub>i</sub> (0 &le; R<sub>i</sub> &le; 20) is the required output for that input value. All input values will be distinct.</p>

<p>Each test case is followed by one empty line. The input is terminated by a line containing one zero in place of the number of inputs.</p>

### 출력

<p>For each test case, generate any program that produces the correct output values for all of the inputs. It means, if the program is executed with the stack initially containing only the input value V<sub>i</sub>, after its successful execution, the stack must contain one single value R<sub>i</sub>.</p>

<p>Your program must strictly satisfy all conditions described in the specification of the problem execute, including the precise formatting, amount of whitespace, maximal program length, limit on numbers, stack size, and so on. Of course, the program must not generate a failure.</p>

<p>Print one empty line after each program, including the last one.</p>