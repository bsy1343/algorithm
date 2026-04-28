# [Platinum V] 모눈종이 자르기 - 2538

[문제 링크](https://www.acmicpc.net/problem/2538)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 719, 정답: 86, 맞힌 사람: 51, 정답 비율: 14.783%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>1㎝ 간격으로 가로선과 세로선이 그어진 직사각형 모양의 모눈종이 위에 한 개의 다각형이 그려져 있다. 다각형의 모든 변은 모눈종이에 그어진 선 위에 있다. 다각형의 변을 따라 모눈종이에서 다각형을 오려내고 나면 하나 이상의 조각들이 남는다.</p>

<p>모눈종이의 가로 길이, 세로 길이와 다각형 한 개가 주어질 때, 이 다각형을 오려낸 후 남은 조각들의 개수와 둘레가 가장 긴 조각의 둘레 길이를 출력하는 프로그램을 작성하시오.</p>

<p>예를 들어, 다음 그림과 같이 모눈종이에 그려진 다각형을 오려내면, 세 개의 조각이 만들어 진다. 조각 1, 조각 2, 조각 3의 둘레 길이는 각각 36㎝, 14㎝, 30㎝이므로, 가장 둘레가 긴 조각의 둘레 길이는 36㎝이다.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/2538.%E2%80%85%EB%AA%A8%EB%88%88%EC%A2%85%EC%9D%B4%E2%80%85%EC%9E%90%EB%A5%B4%EA%B8%B0/fbe40c2d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/2538.%E2%80%85%EB%AA%A8%EB%88%88%EC%A2%85%EC%9D%B4%E2%80%85%EC%9E%90%EB%A5%B4%EA%B8%B0/fbe40c2d.png" data-original-src="https://upload.acmicpc.net/865e2af4-6b92-453c-8a66-38cd47cb002d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 245px; height: 243px;" /></p>

<p>모눈종이에서 다각형을 오려낸 후 남은 조각에 구멍이 있는 경우, 이 조각의 둘레 길이는 모눈종이의 둘레 길이와 다각형의 둘레 길이의 합이다. 예를 들어, 다음 그림에서 조각의 둘레의 길이는 44㎝이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/2538.%E2%80%85%EB%AA%A8%EB%88%88%EC%A2%85%EC%9D%B4%E2%80%85%EC%9E%90%EB%A5%B4%EA%B8%B0/0978c326.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/2538.%E2%80%85%EB%AA%A8%EB%88%88%EC%A2%85%EC%9D%B4%E2%80%85%EC%9E%90%EB%A5%B4%EA%B8%B0/0978c326.png" data-original-src="https://upload.acmicpc.net/1f565de6-442c-486f-aff4-30e16bce6ba4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 153px;" /></p>

<p>단, 아래 그림과 같이 두 꼭짓점의 위치가 같거나 두 변이 서로 교차하는 경우, 두 변이 일부라도 서로 겹치는 경우는 모두 다각형이 아니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/2538.%E2%80%85%EB%AA%A8%EB%88%88%EC%A2%85%EC%9D%B4%E2%80%85%EC%9E%90%EB%A5%B4%EA%B8%B0/0878e78a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/2538.%E2%80%85%EB%AA%A8%EB%88%88%EC%A2%85%EC%9D%B4%E2%80%85%EC%9E%90%EB%A5%B4%EA%B8%B0/0878e78a.png" data-original-src="https://upload.acmicpc.net/c1630dd5-e075-4194-a98d-0ef154d6219f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 237px; height: 83px;" /></p>

<p>모눈종이에 그려진 다각형은 임의의 꼭짓점부터 시작하여 시계반대방향으로 차례로 주어진 꼭짓점들의 위치에 의하여 결정된다. 다각형의 각 꼭짓점의 위치는 모눈종이의 왼쪽 아래 꼭짓점으로부터 오른쪽으로 몇 칸, 위쪽으로 몇 칸 떨어져 있는 지를 나타내는 두 수로 주어진다.</p>

### 입력

<p>첫째 줄에는 모눈종이의 가로 길이와 세로 길이를 나타내는 자연수가 빈칸을 사이에 두고 주어진다. 가로와 세로의 길이는 모두 200000 이하이다. 둘째 줄에는 오려내고자 하는 다각형의 꼭짓점 개수를 나타내는 500000 이하의 자연수가 주어진다. 셋째 줄부터 마지막 줄까지 다각형의 꼭짓점의 위치가 시계반대방향으로 한 줄에 하나씩 차례대로 주어진다. 다각형 꼭짓점의 위치는 모눈종이의 왼쪽 아래 꼭짓점으로부터 오른쪽으로 몇 칸, 위쪽으로 몇 칸 떨어져 있는 지를 나타내는 두 수가 빈칸을 사이에 두고 차례로 주어진다.</p>

### 출력

<p>첫째 줄에 다각형을 오려낸 후 남은 조각들의 개수와 이들 중 가장 긴 둘레의 길이를 출력한다. 단 길이의 단위인 ㎝는 출력하지 않는다.&nbsp;</p>