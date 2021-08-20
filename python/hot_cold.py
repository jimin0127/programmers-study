def hot_cold(emotion):
    # emotion 리스트 속에 냉정과 열정 사이의 사랑의 개수를 세어 반환해 보세요
    cold = emotion.index('냉정')
    hot = emotion.index('열정')

    return abs(cold - hot) - 1

if __name__ == '__main__':
    print(hot_cold(['냉정', '사랑', '사랑', '사랑', '열정', '사랑', '사랑']))
    print(hot_cold(['열정', '사랑', '사랑', '사랑', '냉정', '사랑', '사랑']))
    print(hot_cold(['사랑', '냉정', '사랑', '사랑', '사랑', '사랑', '사랑', '열정']))


