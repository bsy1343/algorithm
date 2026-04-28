# [Platinum IV] Candy Bombers - 11432

[문제 링크](https://www.acmicpc.net/problem/11432)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 161, 정답: 70, 맞힌 사람: 62, 정답 비율: 41.611%

### 분류

이분 매칭

### 문제 설명

<p>As part of the separation of Germany into an Allied-controlled part (France, England, USA) and the Soviet-controlled part, Berlin was also divided into two parts. However, even though West Berlin was part of West Germany, all of Berlin at the time was entirely surrounded by East Germany &mdash; in other words, there was no land connection between West Berlin and the rest of West Germany. In reaction to West Germany introducing a new currency, the Soviet Union cut off all land/water connection to West Germany from 1948&ndash;1949, necessitating what is now called an &ldquo;Air Bridge:&rdquo; allied planes would fly supplies from West Germany to West Berlin. Supposedly at the invention of Gail Halvorsen, pilots started &mdash; as entertainment for the waiting children &mdash; dropping chocolate and other candy from the planes on little homemade parachutes; therefore, they became known as &ldquo;candy bombers.&rdquo;</p>

<p>When you organize an Air Bridge, you have quite a few optimization problems to solve. One of them is how to utilize your available airplanes and pilots to get as much weight as possible to the destination. We assume that each plane can transport the same amount of cargo, so the goal is to fly as many planes as you can. You will be given a list of currently available planes and pilots, and for each pilot the list of planes this pilot could possibly fly.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains two integers 0 &le; m, n &le; 200. m is the number of available airplanes, while n is the number of pilots. This is followed by n lines, one for each pilot. The first number on line i is the number 0 &le; m<sub>i</sub> &le; m of planes that pilot i is capable of flying. This is followed m<sub>i</sub> integer numbers, each between 1 and m, describing the m<sub>i</sub> distinct planes that i can fly.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the maximum total number of planes you can send.</p>

<p>Each data set should be followed by a blank line.</p>