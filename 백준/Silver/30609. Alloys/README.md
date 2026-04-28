# [Silver II] Alloys - 30609

[문제 링크](https://www.acmicpc.net/problem/30609)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 59, 정답: 30, 맞힌 사람: 23, 정답 비율: 44.231%

### 분류

자료 구조, 정렬, 스택

### 문제 설명

<p>A chemical scientist is attempting to create a new metal alloy that possesses both flexibility and conductivity. To achieve this, the scientist blends various types of metals and then assesses their capabilities. Subsequently, the experiments yield varying levels of conductivity and flexibility over time. Certain metal alloys exhibit high flexibility but low conductivity, while others show the opposite, and finally, a few have both attributes in a diminished capacity. To further his experiments, he is solely focused on alloys that are not dominated by others, allowing for more in-depth investigations.</p>

<p>Here, &quot;dominating&quot; refers to an alloy with flexibility x and conductivity y, where no other alloy exhibits both greater flexibility and conductivity.</p>

<p>For instance, consider the testing of five different alloys A, B, C, D, E resulting in the following flexibility and conductivity values: A=(1,5), B=(2,2), C=(3,4), D=(5,2), and E=(4,1). In this scenario, the scientist is particularly interested in alloys A, C, and D.</p>

<p>Another graphical example is depicted in the below image, where red dots represent dominant alloys.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30609.%E2%80%85Alloys/1fcf8cc6.png" data-original-src="https://upload.acmicpc.net/a9b67fb1-a380-4004-b521-efeceeaafdbd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 613px; height: 471px;" /></p>

### 입력

<p>The first line of the input contains a single integer n (0 &lt; n &lt; 10<sup>7</sup>). The remaining n lines of the input contain points in the form of (id flexibility conductivity) separated with space. Both flexibility and conductivity must be considered to be floating point values.</p>

### 출력

<p>The IDs of dominant points separated with space in alphanumeric order.</p>