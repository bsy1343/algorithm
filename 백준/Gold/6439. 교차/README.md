# [Gold I] 교차 - 6439

[문제 링크](https://www.acmicpc.net/problem/6439)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4409, 정답: 1112, 맞힌 사람: 896, 정답 비율: 25.718%

### 분류

기하학, 선분 교차 판정

### 문제 설명

<p>입력으로 주어진 선분과 직사각형이 교차하는지 아닌지를 구하는 프로그램을 작성하시오.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6439.%E2%80%85%EA%B5%90%EC%B0%A8/ee34fd00.gif" data-original-src="https://www.acmicpc.net/upload/images2/Intersection.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:190px; width:217px" /></p>

<p>위의 그림에서 선분의 시작점은 (4,9), 끝점은 (11,2) 이며, 직사각형의 왼쪽 위 좌표는 (1,5), 오른쪽 아래 좌표는 (7, 1)이다. 또, 선분과 직사각형은 교차하지 않는다.</p>

<p>선분과 직사각형이 교차하려면 적어도 한 점을 공유해야한다. 입력으로 주어지는 좌표는 모두 절댓값이 50보다 작거나 같은 정수이지만, 교점은 정수 좌표가 아닐 수도 있다. 직사각형의 넓이는 0일 수도 있다.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, x<sub>start</sub> y<sub>start</sub> x<sub>end</sub> y<sub>end</sub> x<sub>left</sub> y<sub>top</sub> x<sub>right</sub> y<sub>bottom</sub>로 이루어져 있다. (x<sub>start</sub>, y<sub>start</sub>)는 선분의 시작점, (x<sub>end</sub>, y<sub>end</sub>)는 선분의 끝점이고, (x<sub>left</sub>, y<sub>top</sub>)는 직사각형의 한 쪽 모서리 좌표, (x<sub>right</sub>, y<sub>bottom</sub>)는 직사각형 반대쪽 모서리 좌표이다.</p>

<p>x<sub>left</sub> y<sub>top</sub> x<sub>right</sub> y<sub>bottom</sub> 은 직사각형의 왼쪽, 오른쪽, 위, 아래 좌표를 의미하는 것은 아니며, 변수명은 우연의 일치이다.</p>

### 출력

<p>각 테스트 케이스마다 선분과 직사각형이 교차하면 &#39;T&#39;를, 교차하지 않으면 &#39;F&#39;를 한 줄에 하나씩 출력한다. 선분의 두 점이 사각형 내부에 있을 때도 &#39;T&#39;이다.</p>