# [Gold II] 외계인의 침투 - 16490

[문제 링크](https://www.acmicpc.net/problem/16490)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 432, 정답: 352, 맞힌 사람: 309, 정답 비율: 83.967%

### 분류

수학, 기하학

### 문제 설명

<blockquote>
<p><em>2118년, 태양계 밖에 살고 있는 외계인들이 대한민국 부산광역시에 도착했다!</em></p>
</blockquote>

<p>부산광역시의 시민들은 외계인들의 레이저 공격을 막기 위해 위에서 보았을 때&nbsp;원 모양인 성을 쌓았다. 그리고 그 성 위에 세 개의 점 A, B, C를 삼각형 ABC가 정삼각형이 되도록 잡고, 그 정삼각형의 테두리 위에 또 성을 쌓았다.&nbsp;</p>

<p>하지만, 외계인의 레이저는 너무 강력했다. 외계인들이 원 모양의 성 밖에서 레이저를 쏘았는데, 그 레이저가 정확히 점 A를 통과했다. 외계인들이 쏜 레이저와 원 모양의 성벽이 만난 점을 P, 레이저와 삼각형 ABC가 만난 점을 D라고 한다. (단, 점 P, D, A, B, C는 서로 다른 점이며, D는 변 BC 위에 있다.) 그리고, 선분 PA, PB, PC의 길이를 각각 <em>a</em>, <em>b</em>, <em>c</em>, 삼각형 ABC의 한 변의 길이를 <em>t</em>라고 한다.</p>

<p><em>a</em>와 <em>t</em>의 값이 주어지면, <em>b</em>&times;<em>c</em>의 값을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄에 <em>a</em>와 <em>t</em>의 값이 사이에 공백을 한 개 두고 차례대로 주어진다. (단,&nbsp;<i>a</i>와 <em>t</em>의 값은 100 이하의 양의 정수이고, <em>a</em>와 <em>t</em>의 값으로 인해 문제의 상황이 만들어질 수 없는 경우는 주어지지 않는다.)</p>

### 출력

<p>첫 번째 줄에 <em>b</em>&times;<em>c</em>의 값을 소수점 아래의 첫째 자리에서 반올림하여 출력한다.</p>

### 힌트

<p>아래의 그림은 문제의 상황을 나타낸 것이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16490.%E2%80%85%EC%99%B8%EA%B3%84%EC%9D%B8%EC%9D%98%E2%80%85%EC%B9%A8%ED%88%AC/3bcfff41.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/16490.%E2%80%85%EC%99%B8%EA%B3%84%EC%9D%B8%EC%9D%98%E2%80%85%EC%B9%A8%ED%88%AC/3bcfff41.png" data-original-src="https://upload.acmicpc.net/dd5e4724-b87e-42a1-8102-b4c4c5c4be5d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 265px; width: 220px;" /></p>

<p>단, 위의 그림에서 B와 C의 위치는 서로 바뀔 수 있으며, P와 D의 위치는 <em>a</em>와 <em>t</em>의 값으로 바뀐다.</p>