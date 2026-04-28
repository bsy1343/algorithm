# [Platinum I] Getting Confidence - 17535

[문제 링크](https://www.acmicpc.net/problem/17535)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 17, 맞힌 사람: 15, 정답 비율: 62.500%

### 분류

그래프 이론, 최대 유량, 최소 비용 최대 유량

### 문제 설명

<p>Sicrana loves ornaments. At home, she has N ornaments that are displayed lined up on a large shelf. Each ornament is identified by a distinct integer between 1 and N.</p>

<p>One day while playing ball indoors, Fulano, Sicrana&rsquo;s son, hit his mother&rsquo;s ornament shelf with the ball, knocking all the ornaments to the floor. Luckily no ornament was damaged with the fall. If Fulano can put all the ornaments back on the shelf exactly as they once were, his mother may not realize that something wrong has happened.</p>

<p>Since Fulano has a bad memory, he can&rsquo;t remember the order the ornaments were originally in, so he needs your help. For each ornament i, Fulano will tell you N numbers between 1 and 100, where the j-th value indicates the confidence Fulano has that the i ornament was originally in the j position on the shelf. To maximize Fulano&rsquo;s confidence that he won&rsquo;t get grounded, when choosing an order and placing the decorations, Fulano will multiply the confidence that each ornament is in the right place. More formally, Fulano&rsquo;s total confidence in a given order of the decorations is calculated as follows: If p<sub>i</sub> is the position occupied by the i -th ornament and a(i, j) is Fulano&rsquo;s confidence that the i ornament was originally in the position j, then the Fulano&rsquo;s total confidence is given by &prod;a(i, p<sub>i</sub>).</p>

<p>Since there are so many different ways for positioning the ornaments, your mission, if you accept it, is to find the order that maximizes Fulano&rsquo;s total confidence.</p>

### 입력

<p>The first line of input contains an integer N (1 &le; N &le; 100), indicating the number of ornaments. Each of the following N lines contains N integers between 1 and 100. The j-th value in the i-the line represents the confidence Fulano has that the i ornament was originally in the j position on the shelf.</p>

### 출력

<p>Your program must output a single line, containing N integers, representing the order in which Fulano should place the ornaments to maximize his total confidence. If there is more than one order that results in maximum confidence, either order will be accepted.</p>