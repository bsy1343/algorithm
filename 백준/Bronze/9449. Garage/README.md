# [Bronze I] Garage - 9449

[문제 링크](https://www.acmicpc.net/problem/9449)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 380, 정답: 202, 맞힌 사람: 168, 정답 비율: 52.336%

### 분류

수학, 기하학, 사칙연산

### 문제 설명

<p>Wow! What a lucky day! Your company has just won a social contract for building a garage complex. Almost all formalities are done: contract payment is already transferred to your account.</p>

<p>So now it is the right time to read the contract. Okay, there is a sandlot in the form of W &times; H rectangle and you have to place some garages there. Garages are w &times; h rectangles and their edges must be parallel to the corresponding edges of the sandlot (you may not rotate garages, even by 90<sup>◦</sup>). The coordinates of garages may be non-integer.</p>

<p>You know that the economy must be economical, so you decided to place as few garages as possible. Unfortunately, there is an opposite requirement in the contract: placing maximum possible number of garages.</p>

<p>Now let&rsquo;s see how these requirements are checked. . . The plan is accepted if it is impossible to add a new garage without moving the other garages (the new garage must also have edges parallel to corresponding sandlot edges).</p>

<p style="text-align: center;"><img alt="" src="/upload/images2/garage.png" style="height:111px; width:676px" /></p>

<p>Time is money, find the minimal number of garages that must be ordered, so that you can place them on the sandlot and there is no place for an extra garage.</p>

### 입력

<p>The only line contains four integers: W, H, w, h &mdash; dimensions of sandlot and garage in meters. You may assume that 1 &le; w &le; W &le; 30 000 and 1 &le; h &le; H &le; 30 000.</p>

### 출력

<p>Output the optimal number of garages.</p>

### 힌트

<p>The plan on the first picture is accepted and optimal for the first example. Note that a rotated (2 &times; 3) garage could be placed on the sandlot, but it is prohibited by the contract.</p>