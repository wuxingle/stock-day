package com.stock.stockday.util;


import com.stock.apicommon.entity.ScienceEntity;

import java.util.List;

public class FindUtil57 {

    public static boolean duoTuXiangShangDapan2(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiaxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan2(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiashang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan2(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan3(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan3(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan10(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan4(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiaxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan4(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiashang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean duoTuXiangShangDapan3(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan3(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan3(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan5(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj20xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan5(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiaxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan6(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiashang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan7(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean duoTuXiangShangDapan4(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean shengVDapan4(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean reset20Dapan4(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiashang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan6(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiaxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan8(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiashang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jishujieqiDapan9(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        if (scienceEntityList == null || scienceEntityList.size() == 0) {
            return false;
        }
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan7(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan8(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan9(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50xiajc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan11(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiaxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan12(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiashang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan13(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan14(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan15(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            boolean result =FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan16(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangshang(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan17(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiaxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan18(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0xiashang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan19(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan20(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0zshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan21(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {

        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangxia(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public static boolean jieQiDapan22(List<ScienceEntity> scienceEntityList, List<ScienceEntity> scienceEntityListDaPan) {
        try {
            boolean result = FindUtil50.macd0xiaxia(scienceEntityListDaPan);
            boolean result2 = FindUtil50.kdj50shangjc(scienceEntityListDaPan);
            if (result && result2) {
                boolean result1 = FindUtil50.macd0shangshang(scienceEntityList);
                if (result1) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }


}
